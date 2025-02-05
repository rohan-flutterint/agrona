/*
 * Copyright 2014-2025 Real Logic Limited.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.agrona.concurrent.status;

import org.agrona.concurrent.AtomicBuffer;
import org.agrona.concurrent.UnsafeBuffer;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AtomicCountersTest
{

    @Test
    public void testPlain()
    {
        final AtomicBuffer buffer = new UnsafeBuffer(new byte[8]);
        final AtomicCounter counter = new AtomicCounter(buffer, 0);

        assertEquals(0, counter.getPlain());

        counter.incrementPlain();
        assertEquals(1, counter.getPlain());

        counter.setPlain(42);
        assertEquals(42, counter.getPlain());

        counter.decrementPlain();
        assertEquals(41, counter.getPlain());
    }
}
