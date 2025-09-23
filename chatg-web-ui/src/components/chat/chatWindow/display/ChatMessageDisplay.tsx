import { styles } from "@components/chat/chatWindow/display/style.ts"

export const ChatMessageDisplay = () => {
    return (
        <div style={styles.displayContainer}>
            <div style={styles.messageDisplay}>
                Chat Messages displayed here...
            </div>
        </div>
    )
}