/*
 * Custom enchantments for Minecraft
 * Copyright (C) 2021 Big_Bad_E
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.bigbade.enchantmenttokens.utils;

import org.bukkit.Bukkit;
import com.bigbade.enchantmenttokens.EnchantmentTokens;

public class SchedulerHandler {
    private final EnchantmentTokens main;

    public SchedulerHandler(EnchantmentTokens main) {
        this.main = main;
    }

    public void runTaskLater(Runnable runnable, long delay) {
        Bukkit.getScheduler().runTaskLater(main, runnable, delay);
    }

    public int runTaskAsyncRepeating(Runnable runnable, long delay, long repeat) {
        return Bukkit.getScheduler().runTaskTimerAsynchronously(main, runnable, delay, repeat).getTaskId();
    }

    public void runTaskAsync(Runnable runnable) {
        Bukkit.getScheduler().runTaskAsynchronously(main, runnable);
    }

    public void cancel(int taskId) {
        Bukkit.getScheduler().cancelTask(taskId);
    }
}
