package io.github.jamielu.jamiecache.command;

import io.github.jamielu.jamiecache.core.Command;
import io.github.jamielu.jamiecache.core.CacheMemory;
import io.github.jamielu.jamiecache.core.Reply;

/**
 * Scard command.
 *
 * @Author : jamieLu
 * @create 2024/6/25
 */
public class ScardCommand implements Command {
    @Override
    public String name() {
        return "SCARD";
    }

    @Override
    public Reply<?> exec(CacheMemory cache, String[] args) {
        String key = getKey(args);
        return Reply.integer(cache.scard(key));
    }
}
