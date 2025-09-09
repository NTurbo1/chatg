interface User {
    firstName: string;
    lastName: string;
}

export const someFunction = (user: User): void => {
    console.log("{firstName: " + user.firstName + ", lastName: ", user.lastName + "}")
}