import type { CSSProperties } from "react";
import palette from "@style/palette.ts";

const sideBar: CSSProperties = {
    height: "100vh",
    width: "17%",
    minWidth: "100px",
    backgroundColor: palette.background,
    color: palette.primaryText,
    borderWidth: "3px",
    borderStyle: "solid",
    borderColor: palette.border,
}

const styles: {[key: string]: CSSProperties} = {
    sideBar: sideBar
}

export default styles