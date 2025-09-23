const DEV = "env"
const PROD = "prod"

export const logInfo = (message?: any, ...optionalParams: any[]): void => {
    if (process.env.APP_ENV === DEV) {
        console.info(message, optionalParams)
    }
}

export const logDebug = (message?: any, ...optionalParams: any[]): void => {
    if (process.env.APP_ENV === DEV) {
        console.debug(message, optionalParams)
    }
}

export const logError = (message?: any, ...optionalParams: any[]): void => {
    if (process.env.APP_ENV === DEV) {
        console.error(message, optionalParams)
    }
}