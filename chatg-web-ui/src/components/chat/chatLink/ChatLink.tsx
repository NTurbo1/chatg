import { Link } from "react-router"
import type { ReactNode } from "react"

interface IProps {
    children: string
    path: string
    connectionUrl: string
}

export const ChatLink = (props: IProps) => {
    const { connectionUrl, path, children } = props;

    return (
        <Link to={path}>{children}</Link>
    )
}