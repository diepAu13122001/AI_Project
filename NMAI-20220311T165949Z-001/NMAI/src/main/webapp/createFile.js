function createFile(data) {
    const fslibrary = require('fs');
    fslibrary.writeFile("D:\\newfile.txt", data, (error) => {
        if (error) throw err;
    })
}