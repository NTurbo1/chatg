import type { CSSProperties } from "react";
import palette from "@style/palette.ts";

const sideBarContainer: CSSProperties = {
    height: "100vh",
    width: "17%",
    display: "flex",
}

const sideBar: CSSProperties = {
    flex: 1,
    minWidth: "100px",
    margin: "10px",
    backgroundColor: palette.background,
    color: palette.primaryText,
    borderWidth: "3px",
    borderStyle: "solid",
    borderColor: palette.border,
    boxShadow: `0 0 10px ${palette.primaryText}, 0 0 20px ${palette.primaryText}`,
    borderRadius: "15px",

    display: "flex",
    flexDirection: "column",
    alignItems: "center"
}

const styles: {[key: string]: CSSProperties} = {
    sideBar,
    sideBarContainer
}

export default styles