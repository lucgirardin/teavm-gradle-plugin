/*  Copyright 2019 Balázs Zaicsek
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package io.github.zebalu.gradle.teavm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.teavm.tooling.TeaVMToolLog;

/**
 * Wrapper of {@link Logger} class to be able to be passed to anything needs a
 * {@link TeaVMToolLog} class.
 * 
 * @author zebalu
 *
 */
public class Slf4JTeavmLog implements TeaVMToolLog {

    private final Logger log;

    public Slf4JTeavmLog(Class<?> clazz) {
        this(LoggerFactory.getLogger(clazz));
    }

    public Slf4JTeavmLog(Logger log) {
        this.log = log;
    }

    @Override
    public void info(String text) {
        log.info(text);
    }

    @Override
    public void debug(String text) {
        log.debug(text);
    }

    @Override
    public void warning(String text) {
        log.warn(text);
    }

    @Override
    public void error(String text) {
        log.error(text);
    }

    @Override
    public void info(String text, Throwable e) {
        log.info(text, e);
    }

    @Override
    public void debug(String text, Throwable e) {
        log.debug(text, e);
    }

    @Override
    public void warning(String text, Throwable e) {
        log.warn(text, e);
    }

    @Override
    public void error(String text, Throwable e) {
        log.error(text, e);
    }

}
