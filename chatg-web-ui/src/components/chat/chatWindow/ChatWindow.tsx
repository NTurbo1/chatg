import { useState } from "react"

import { SendMessageForm } from "@common/form/message/SendMessageForm.tsx"
import { ChatMessageDisplay } from "@components/chat/chatWindow/display/ChatMessageDisplay.tsx"
import { styles } from "@components/chat/chatWindow/style.ts"

interface IProps {

}

export const ChatWindow = (props: IProps) => {
    const [messageInput, setMessageInput] = useState<string>("")

    return (
        <div style={styles.window}>
            <div style={styles.modal}>
                CHAT MODAL
                <ChatMessageDisplay />
                <SendMessageForm messageInput={messageInput} setMessageInput={setMessageInput} />
            </div>
        </div>
    )
}