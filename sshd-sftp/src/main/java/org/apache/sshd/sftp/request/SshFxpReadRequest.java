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
 * Data container for 'SSH_FXP_READ' request.
 * 
 * @author <a href="http://mina.apache.org">Apache MINA Project</a>
 */
public class SshFxpReadRequest extends Request {
	private final String handleId;
	private final long offset;
	private final Handle handle;
	private final int len;

	/**
	 * Creates a SshFxpReadRequest instance.
	 * 
	 * @param id       The request id.
	 * @param handleId The according file handle id.
	 * @param offset   The read offset.
	 * @param lenFlag  The lenFlag.
	 * @param handle   The according file handle.
	 */
	public SshFxpReadRequest(
			final int id, final String handleId, final long offset, final int len, final Handle handle) {
		super(id);
		this.handleId = handleId;
		this.offset = offset;
		this.len = len;
		this.handle = handle;
	}

	/**
	 * {@inheritDoc}
	 */
	public String getName() {
		return "SSH_FXP_READ";
	}

	/**
	 * {@inheritDoc}
	 */
	public String toString() {
        return "Status=" + getName() + "; Message=handle=" + handleId + ", file="
        		+ getHandle().getFile().getAbsolutePath() + ", offset=" + offset + ";";
	}

	/**
	 * Returns the according handle.
	 * 
	 * @return The according handle.
	 */
	public Handle getHandle() {
		return handle;
	}

	/**
	 * Returns the handle id.
	 * 
	 * @return The handle id.
	 */
	public String getHandleId() {
		return handleId;
	}

	/**
	 * Returns the len flag.
	 * 
	 * @return The len flag.
	 */
	public int isLen() {
		return len;
	}

	/**
	 * Returns the offset.
	 * 
	 * @return The offset.
	 */
	public long getOffset() {
		return offset;
	}

	public int getLen() {
		// TODO Auto-generated method stub
		return 0;
	}
}
