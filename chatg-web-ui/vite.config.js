import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'
import path from "path"

// https://vite.dev/config/
export default defineConfig(({ mode }) => {
    const ENV_CONFIG = require(`./env_${mode}.json`)

    return {
        plugins: [react()],
        define: {
            "process.env": {
                ...ENV_CONFIG
            }
        },
        resolve: {
            alias: {
                "@components": path.resolve(__dirname, "src/components"),
                "@features": path.resolve(__dirname, "src/features"),
                "@pages": path.resolve(__dirname, "src/pages"),
                "@style": path.resolve(__dirname, "src/style"),
                "@log": path.resolve(__dirname, "src/log"),
                "@hooks": path.resolve(__dirname, "src/hooks"),
                "@context": path.resolve(__dirname, "src/context"),
                "@common": path.resolve(__dirname, "src/common"),
            }
        }
    }
})
