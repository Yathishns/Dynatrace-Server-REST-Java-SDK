/*
 * Dynatrace Server SDK
 * Copyright (c) 2008-2016, DYNATRACE LLC
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *  Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 *  Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *  Neither the name of the dynaTrace software nor the names of its contributors
 * may be used to endorse or promote products derived from this software without
 * specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT
 * SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED
 * TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR
 * BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
 * ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH
 * DAMAGE.
 */

package com.dynatrace.sdk.server.memorydumps.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "agentpattern")
@XmlAccessorType(XmlAccessType.FIELD)
public class AgentPattern {
    @XmlElement(name = "agentname")
    private String agentName;
    private String hostname;
    @XmlElement(name = "processid")
    private Integer processId;

    public AgentPattern(String agentName, String hostname, Integer processId) {
        this.agentName = agentName;
        this.hostname = hostname;
        this.processId = processId;
    }

    public AgentPattern() {
    }

    public String getAgentName() {
        return this.agentName;
    }

    public String getHostname() {
        return this.hostname;
    }

    public Integer getProcessId() {
        return this.processId;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public void setProcessId(Integer processId) {
        this.processId = processId;
    }

    @Override
    public String toString() {
        return "AgentPattern{" +
                "agentName='" + this.agentName + '\'' +
                ", hostname='" + this.hostname + '\'' +
                ", processId=" + this.processId +
                '}';
    }

}
