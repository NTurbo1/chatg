import type { CSSProperties } from "react"

import palette from "@style/palette.ts"

const sendButton: CSSProperties = {
    borderWidth: "3px",
    borderStyle: "solid",
    borderColor: palette.border,
    borderRadius: "8px",
    boxShadow: `0 0 10px ${palette.primaryText}, 0 0 20px ${palette.primaryText}`,

    cursor: "pointer",
    boxSizing: "border-box",
    width: "fit-content",
    padding: "5px"
}

export const styles: {[key: string]: CSSProperties} = {
    sendButton
}