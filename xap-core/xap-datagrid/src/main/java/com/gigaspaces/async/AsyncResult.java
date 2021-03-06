/*
 * Copyright (c) 2008-2016, GigaSpaces Technologies, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.gigaspaces.async;

/**
 * An async invocation result holding the actual result of the invocation or an possible exception
 * raised during the invocation.
 *
 * @author Assaf Ronen
 * @since 6.6
 */
public interface AsyncResult<T> {
    /**
     * Returns the result of the async invocation. Returns <code>null</code> in case of an
     * exception. {@link #getException()} should be checked for successful execution.
     */
    T getResult();

    /**
     * In case of an async invocation failure, returns the exception causing it. If the invocation
     * is successful, this method returns <code>null</code>.
     */
    Exception getException();
}
