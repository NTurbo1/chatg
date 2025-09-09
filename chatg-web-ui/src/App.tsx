import { Routes, Route } from "react-router"
import { DashBoardPage } from "./pages/DashBoard/DashBoardPage.tsx";

const App = () => {
    return (
        <Routes>
            <Route path="/" element={<DashBoardPage />}>
            </Route>
        </Routes>
    )
}

export default App;