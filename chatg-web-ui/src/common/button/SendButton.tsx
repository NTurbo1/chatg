import "@common/button/button_normalize.css"
import { styles } from "@common/button/style.ts"

interface IProps {
    children: string
}

export const SendButton = (props: IProps) => {
    const { children } = props

    return (
        <button style={styles.sendButton}>{children}</button>
    )
}