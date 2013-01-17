/*
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements. See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership. The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License. You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied. See the License for the
* specific language governing permissions and limitations
* under the License.
*/
package org.apache.sshd.sftp.request;

import org.apache.sshd.sftp.Handle;

/**
 * Data container for 'SSH_FXP_READDIR' request.
 * 
 * @author <a href="http://mina.apache.org">Apache MINA Project</a>
 */
public class SshFxpReaddirRequest extends Request {
	private final String handleId;
	private final Handle handle;

	/**
	 * Creates a SshFxpReaddirRequest instance.
	 * 
	 * @param id       The request id.
	 * @param handleId The according handle id.
	 * @param handle   The according file handle.
	 */
	public SshFxpReaddirRequest(final int id, final String handleId, final Handle handle) {
		super(id);
		this.handleId = handleId;
		this.handle = handle;
	}

	/**
	 * {@inheritDoc}
	 */
	public String getName() {
		return "SSH_FXP_READDIR";
	}

	/**
	 * {@inheritDoc}
	 */
	public String toString() {
        return "Status=" + getName() + "; Message="
        	+ "handle=" + handleId + ", file=" + handle.getFile().getAbsolutePath() + ";";
	}

	/**
	 * Returns the handle id.
	 * 
	 * @return The handle id.
	 */
	public String getHandleId() {
		return handleId;
	}
}
