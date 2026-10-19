// ============================================================================
//
// Copyright (C) 2006-2026 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.ui.ai;

/**
 * A message of a conversation with the assistant (text only).
 */
public class AiChatMessage {

    public enum Role {
        USER,
        ASSISTANT
    }

    private final Role role;

    private final String text;

    public AiChatMessage(Role role, String text) {
        this.role = role;
        this.text = text;
    }

    public Role getRole() {
        return role;
    }

    public String getText() {
        return text;
    }
}
