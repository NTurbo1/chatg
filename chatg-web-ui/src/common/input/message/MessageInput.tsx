import type { Dispatch, SetStateAction } from "react"

import "@common/input/input_normalize.css"
import { styles } from "@common/input/message/style.ts"

interface IProps {
    messageInput: string
    setMessageInput: Dispatch<SetStateAction<string>>
}

export const MessageInput = (props: IProps) => {
    const { messageInput, setMessageInput } = props

    return (
        <div style={styles.inputContainer}>
            <input 
                style={styles.messageInput}
                type="text" 
                placeholder="Write here..." 
                value={messageInput}
                onChange={(event) => {
                    setMessageInput(event.target.value)
                }}
            />
        </div>
    )
}