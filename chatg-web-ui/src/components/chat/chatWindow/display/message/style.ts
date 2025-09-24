import type { CSSProperties } from "react"

import type { TStyles } from "@style/palette.ts"
import palette from "@style/palette.ts"

const messageContainer: CSSProperties = {
    width: "100%",
    display: "flex",
    gap: "20px",
}

const senderContainer: CSSProperties = {
    paddingTop: "8px"
}

const textContainer: CSSProperties = {
    padding: "5px",
    maxWidth: "100%",
    overflowWrap: "anywhere",

    borderWidth: "3px",
    borderStyle: "solid",
    borderColor: palette.border,
    borderRadius: "8px",
    boxShadow: `0 0 10px ${palette.primaryText}, 0 0 20px ${palette.primaryText}`,
}

export const styles: TStyles = {
    messageContainer,
    senderContainer,
    textContainer
}