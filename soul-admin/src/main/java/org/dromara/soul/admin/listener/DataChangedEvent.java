/*
 *   Licensed to the Apache Software Foundation (ASF) under one or more
 *   contributor license agreements.  See the NOTICE file distributed with
 *   this work for additional information regarding copyright ownership.
 *   The ASF licenses this file to You under the Apache License, Version 2.0
 *   (the "License"); you may not use this file except in compliance with
 *   the License.  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package org.dromara.soul.admin.listener;

import org.dromara.soul.common.enums.ConfigGroupEnum;
import org.springframework.context.ApplicationEvent;

import java.util.List;

/**
 * Data change event.
 *
 * @author huangxiaofeng
 * @date 2019/6/29 23:55
 * @see DataChangedEventDispatcher
 * @since 2.0.0
 */
public class DataChangedEvent extends ApplicationEvent {

    private DataEventType eventType;

    private ConfigGroupEnum groupKey;

    public DataChangedEvent(ConfigGroupEnum groupKey, DataEventType type, List<?> source) {
        super(source);
        this.eventType = type;
        this.groupKey = groupKey;
    }

    public DataEventType getEventType() {
        return eventType;
    }

    @Override
    public List<?> getSource() {
        return (List<?>) super.getSource();
    }

    public ConfigGroupEnum getGroupKey() {
        return this.groupKey;
    }

}
