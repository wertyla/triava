/*********************************************************************************
 * Copyright 2016-present trivago GmbH
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **********************************************************************************/

package com.trivago.triava.tcache;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class CacheListenerTestAsync extends CacheListenerTest
{
	private static final long serialVersionUID = -5969452247309959918L;

	public CacheListenerTestAsync()
	{
		super(1000, TimeUnit.MILLISECONDS);
	}
	
	@Test
	public void testListenerSynchronous()
	{
		testListener();
	}

	@Test
	public void testWriteMoreThanCapacitySynchronous()
	{
		// Eviction is always asynchronous, and thus we do an ASYNC check here
		testWriteMoreThanCapacity();
	}
}
