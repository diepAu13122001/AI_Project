var data = [
    {
        title: "Ngày kinh sắp tới",
        decription: "4 ngày nữa",
        color: "pink"
    },
    {
        title: "kcal còn lại",
        decription: "678 kcal",
        color: "amber"
    },
    {
        title: "Thời gian tập thể dục ",
        decription: "45 phút",
        color: "cyan"
    },
    {
        title: "BMI  ",
        decription: "16.7",
        color: "deepOrange"
    },
];

var datas = data.map((item) => {
    return (`
    <div className="col-xl-3 col-lg-4 col-sm-6">
                      <div className="icon-card mb-30">
                          <div className="icon success">
                              <i className="material-icons">local_play</i>
                          </div>
                          <div className="content">
                              <h6 className="mb-10">${item.title}</h6>
                              <h3 className="text-bold mb-10"${item.decription}</h3>
                              <p className="text-sm text-success">
                                  <i className="lni lni-arrow-up"></i> +5.45%
                                  <span className="text-gray">Increased</span>
                              </p>
                          </div>
                      </div>
                      <!-- End Icon Cart -->
                  </div>`)
})

document.getElementById("cart").innerHTML = datas.join(" ")
console.log("aaaaa")
