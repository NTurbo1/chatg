import type { CSSProperties } from "react"
import palette from "@style/palette.ts"

const page: CSSProperties = {
    height: "100vh",
    width: "100vw",
    backgroundColor: palette.background,
    color: palette.primaryText,
    display: "flex",
    flexDirection: "column",
}

const styles: {[key: string]: CSSProperties} = {
    page: page
}

export default styles