import type { CSSProperties } from "react"

import palette from "@style/palette.ts"

const displayContainer: CSSProperties = {
    width: "100%",
    marginTop: "20px",
    marginBottom: "20px",

    flex: 1
}

const messageDisplay: CSSProperties = {
    margin: "0 25%",
    maxHeight: "1000px",
    padding: "20px",

    overflow: "auto",

    display: "flex",
    flexDirection: "column",
    gap: "10px",

    borderWidth: "3px",
    borderStyle: "solid",
    borderColor: palette.border,
    borderRadius: "8px",
    boxShadow: `0 0 10px ${palette.primaryText}, 0 0 20px ${palette.primaryText}`,
}

export const styles: {[key: string]: CSSProperties} = {
    displayContainer,
    messageDisplay
}