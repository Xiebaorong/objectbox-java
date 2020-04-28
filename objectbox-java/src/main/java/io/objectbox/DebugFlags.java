/*
 * Copyright 2020 ObjectBox Ltd. All rights reserved.
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

// automatically generated by the FlatBuffers compiler, do not modify

package io.objectbox;

/**
 * Not really an enum, but binary flags to use across languages
 */
public final class DebugFlags {
  private DebugFlags() { }
  public static final int LOG_TRANSACTIONS_READ = 1;
  public static final int LOG_TRANSACTIONS_WRITE = 2;
  public static final int LOG_QUERIES = 4;
  public static final int LOG_QUERY_PARAMETERS = 8;
  public static final int LOG_ASYNC_QUEUE = 16;
  public static final int LOG_CACHE_HITS = 32;
  public static final int LOG_CACHE_ALL = 64;
}

