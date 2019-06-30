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

import org.dromara.soul.common.dto.AppAuthData;
import org.dromara.soul.common.dto.PluginData;
import org.dromara.soul.common.dto.RuleData;
import org.dromara.soul.common.dto.SelectorData;

import java.util.List;

/**
 * Event listener, used to send notification of event changes,
 * used to support HTTP, websocket, zookeeper and other event notifications.
 *
 * @author huangxiaofeng
 * @date 2019/6/25 17:25
 */
public interface DataChangedListener {

    /**
     * invoke this method when AppAuth was received.
     */
    default void onAppAuthChanged(List<AppAuthData> changed, DataEventType eventType){};

    /**
     * invoke this method when Plugin was received.
     */
    default void onPluginChanged(List<PluginData> changed, DataEventType eventType){};

    /**
     * invoke this method when Rule was received.
     */
    default void onRuleChanged(List<RuleData> changed, DataEventType eventType){};

    /**
     * invoke this method when Selector was received.
     */
    default void onSelectorChanged(List<SelectorData> changed, DataEventType eventType){};

}
