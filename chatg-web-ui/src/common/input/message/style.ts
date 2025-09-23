import type { CSSProperties } from "react"

import palette from "@style/palette.ts"

const inputContainer: CSSProperties = {
    marginTop: "auto",
}

const messageInput: CSSProperties = {
    borderWidth: "3px",
    borderStyle: "solid",
    borderColor: palette.border,
    borderRadius: "8px",
    boxShadow: `0 0 10px ${palette.primaryText}, 0 0 20px ${palette.primaryText}`,

    padding: "8px",
    width: "800px"
}

export const styles: {[key: string]: CSSProperties} = {
    inputContainer,
    messageInput
}