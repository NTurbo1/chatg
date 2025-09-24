import type { Dispatch, SetStateAction } from "react"

import { MessageInput } from "@common/input/message/MessageInput.tsx"
import { SendButton } from "@common/button/SendButton.tsx"
import { styles } from "@common/form/message/style.ts"

interface IProps {
    messageInput: string
    setMessageInput: Dispatch<SetStateAction<string>>
}

export const SendMessageForm = (props: IProps) => {
    const { messageInput, setMessageInput } = props

    return (
        <div style={styles.formContainer}>
            <MessageInput 
                messageInput={messageInput} 
                setMessageInput={setMessageInput}
            />
            <SendButton>Send</SendButton>
        </div>
    )
}