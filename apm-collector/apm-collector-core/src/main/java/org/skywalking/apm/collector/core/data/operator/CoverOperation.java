/*
 * Copyright 2017, OpenSkywalking Organization All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Project repository: https://github.com/OpenSkywalking/skywalking
 */

package org.skywalking.apm.collector.core.data.operator;

import org.skywalking.apm.collector.core.data.Operation;

/**
 * 值覆盖操作，即以新值为返回。
 *
 * @author peng-yongsheng
 */
public class CoverOperation implements Operation {
    @Override public String operate(String newValue, String oldValue) {
        return newValue;
    }

    @Override public Long operate(Long newValue, Long oldValue) {
        return newValue;
    }

    @Override public Double operate(Double newValue, Double oldValue) {
        return newValue;
    }

    @Override public Integer operate(Integer newValue, Integer oldValue) {
        return newValue;
    }

    @Override public Boolean operate(Boolean newValue, Boolean oldValue) {
        return newValue;
    }

    @Override public byte[] operate(byte[] newValue, byte[] oldValue) {
        return newValue;
    }
}
