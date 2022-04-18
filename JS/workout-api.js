const axios = require("axios");

const options = {
    method: 'GET',
    url: 'https://exercisedb.p.rapidapi.com/exercises/bodyPart/waist',
    headers: {
        'X-RapidAPI-Host': 'exercisedb.p.rapidapi.com',
        'X-RapidAPI-Key': 'fcb9dc4e14msh8e85a2c1001d2f9p1d7118jsn8267b87e811d'
    }
};

axios.request(options).then(function (response) {
    document.getElementById("num1").textContent = response.data[1]
    console.log(response.data);
}).catch(function (error) {
    console.error(error);
});