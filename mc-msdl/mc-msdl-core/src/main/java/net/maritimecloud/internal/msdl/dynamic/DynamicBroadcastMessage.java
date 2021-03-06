/* Copyright (c) 2011 Danish Maritime Authority.
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
 */
package net.maritimecloud.internal.msdl.dynamic;

import java.io.IOException;

import net.maritimecloud.message.MessageReader;
import net.maritimecloud.msdl.model.BroadcastMessageDeclaration;
import net.maritimecloud.net.BroadcastMessage;

/**
 *
 * @author Kasper Nielsen
 */
public class DynamicBroadcastMessage extends DynamicMessage implements BroadcastMessage {

    /**
     * @param md
     */
    public DynamicBroadcastMessage(BroadcastMessageDeclaration md) {
        super(md);
    }

    /** {@inheritDoc} */
    @Override
    public BroadcastMessage immutable() {
        return this;
    }

    public static DynamicBroadcastMessage readFrom(BroadcastMessageDeclaration definition, MessageReader reader)
            throws IOException {
        DynamicBroadcastMessage m = new DynamicBroadcastMessage(definition);
        m.readFrom(reader);
        return m;
    }
}
