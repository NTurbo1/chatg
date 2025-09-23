import type { CSSProperties } from "react"
import palette from "@style/palette.ts"

const window: CSSProperties = {
    backgroundColor: palette.background,
    height: "100vh",
    flex: 1,
    padding: "40px"
}

const modal: CSSProperties = {
    color: palette.primaryText,
    width: "100%",
    height: "100%",
    paddingTop: "10px",
    paddingBottom: "40px",

    display: "flex",
    flexDirection: "column",
    alignItems: "center",

    borderWidth: "3px",
    borderStyle: "solid",
    borderColor: palette.border,
    boxShadow: `0 0 10px ${palette.primaryText}, 0 0 20px ${palette.primaryText}`,
    borderRadius: "15px",
}

export const styles: {[key: string]: CSSProperties} = {
    window,
    modal
}