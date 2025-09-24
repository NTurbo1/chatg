import { styles } from "@components/chat/chatWindow/display/message/style.ts"

interface IProps {
    messageText: string
    senderUsername: string
}

export const Message = (props: IProps) => {
    const { messageText, senderUsername } = props

    return (
        <div style={styles.messageContainer}>
            <div style={styles.senderContainer}>{senderUsername}:</div>
            <div style={styles.textContainer}>{messageText}</div>
        </div>
    )
}