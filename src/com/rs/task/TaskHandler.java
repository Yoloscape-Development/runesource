package com.rs.task;
/*
 * This file is part of RuneSource.
 *
 * RuneSource is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * RuneSource is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with RuneSource.  If not, see <http://www.gnu.org/licenses/>.
 */

import com.rs.entity.player.Player;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * A simple handler to manage tasks.
 *
 * @author Pure_
 */
public final class TaskHandler {

    /**
     * A collection of tasks.
     */
    private static ArrayList<Task> tasks = new ArrayList<Task>();

    /**
     * Performs a processing task on all active tasks.
     */
    public static void tick() {
        for (Iterator<Task> itr = tasks.iterator(); itr.hasNext(); ) {
            Task task = itr.next();

            // Removing completed tasks
            if (!task.isRunning()) {
                itr.remove();
                continue;
            }

            // Processing task
            task.tick();
        }
    }

    /**
     * Deactivates all tasks which belong to the given player.
     *
     * @param player
     */
    public static void removeTasks(Player player) {
        for (Task task : tasks) {
            if (task.getPlayer().equals(player)) {
                task.setRunning(false);
            }
        }
    }

    /**
     * Adds a task to the execution list.
     *
     * @param task
     */
    public static void submit(Task task) {
        tasks.add(task);
    }
}
