const products = [
  {
    index: "1",
    idpduct: "SM112",
    productName: "SƠN MÓNG TAY ROMAND MOOD PEBBLE NAILS 7G",
    trademark: "ROMAND",
    price: "109.000đ",
    image: "../image/sonmongtron14.jpg",
    iconeye: "bi bi-eye-fill",
    icondetail: "bi bi-pencil-fill",
    icondete: "bi bi-trash-fill",
  },
  {
    index: "2",
    idpduct: "BE105",
    productName: "SƠN MÓNG TAY PLAY COCOA NUDE",
    trademark: "PLAY",
    price: "50.000đ",
    image: "../image/sonmongtron1.jpg",
    iconeye: "bi bi-eye-fill",
    icondetail: "bi bi-pencil-fill",
    icondete: "bi bi-trash-fill",
  },
  {
    index: "3",
    idpduct: "ES002",
    productName: "NƯỚC SƠN MÓNG CAO CẤP ESSIE",
    trademark: "ESSIE",
    price: "60.000đ",
    image: "../image/sonmongtron3.jpg",
    iconeye: "bi bi-eye-fill",
    icondetail: "bi bi-pencil-fill",
    icondete: "bi bi-trash-fill",
  },
  {
    index: "4",
    idpduct: "SR420",
    productName: "SERUM DƯỠNG MÓNG INNISFREE",
    trademark: "paly",
    price: "59.850đ",
    image: "../image/sonduong1.jpg",
    iconeye: "bi bi-eye-fill",
    icondetail: "bi bi-pencil-fill",
    icondete: "bi bi-trash-fill",
  },
  {
    index: "5",
    idpduct: "FE271",
    productName: "SƠN DƯỠNG CỨNG MÓNG FELINA",
    trademark: "FELINA",
    price: "59.900đ",
    image: "../image/sonduong.jpg",
    iconeye: "bi bi-eye-fill",
    icondetail: "bi bi-pencil-fill",
    icondete: "bi bi-trash-fill",
  },
  {
    index: "6",
    idpduct: "OI376",
    productName: "SƠN BÓNG NHANH KHÔ OPI",
    trademark: "OPI",
    price: "39.990đ",
    image: "../image/sonduong5.jpg",
    iconeye: "bi bi-eye-fill",
    icondetail: "bi bi-pencil-fill",
    icondete: "bi bi-trash-fill",
  },
  {
    index: "7",
    idpduct: "SG221",
    productName: "SƠN GEL CHÍNH HÃNG GELCHARM",
    trademark: "GELCHARM",
    price: "85.000đ",
    image: "../image/songel.jpg",
    iconeye: "bi bi-eye-fill",
    icondetail: "bi bi-pencil-fill",
    icondete: "bi bi-trash-fill",
  },
  {
    index: "8",
    idpduct: "NS781",
    productName: "NƯỚC SƠN MÓNG MÀU PASTEL MJ",
    trademark: "MJ",
    price: "69.300đ",
    image: "../image/nuocsonbong1.jpg",
    iconeye: "bi bi-eye-fill",
    icondetail: "bi bi-pencil-fill",
    icondete: "bi bi-trash-fill",
  },
  {
    index: "9",
    idpduct: "OY701",
    productName: "MÀU SƠN HOT NHẤT HIỆN NAY CỦA O'YAFUN",
    trademark: "O'YAFUN",
    price: "150.000đ",
    image: "../image/sonmongtroncombo.jpg",
    iconeye: "bi bi-eye-fill",
    icondetail: "bi bi-pencil-fill",
    icondete: "bi bi-trash-fill",
  },
  {
    index: "10",
    idpduct: "KT673",
    productName: "SƠN MÓNG KIM TUYẾN LẤP LÁNH RUM",
    trademark: "RUM",
    price: "69.300đ",
    image: "../image/sonmongkimtuyen.jpg",
    iconeye: "bi bi-eye-fill",
    icondetail: "bi bi-pencil-fill",
    icondete: "bi bi-trash-fill",
  },


]
const product = products.map((item) => {
  // var iconEye = [item.iconEye]
  // var iconHeart = [item.iconHeart]
  // var iconStart = "bi " + [item.iconStart]
  console.log(item.productName)
  console.log(item.image)
  return (`
       <tr>
        <th>${item.index}</th>
        <td>${item.idpduct} </td>
        <td>${item.productName}</td>
        <td>${item.trademark}</td>
         <td>${item.price}</td>
         <td><img src=${item.image} style="height: 80px; width: 70px" alt="Nnail"></td>
          <td><span><i class="text-warning ${item.iconeye} "></i></span>
              <button type="button" class="btn" data-bs-toggle="modal" data-bs-target="#exampleModal"><span><i class="text-primary ${item.icondetail}"></i></span></button>
              <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                  <div class="modal-content">
                    <div class="modal-header">
                      <h5 class="modal-title" id="exampleModalLabel">Chỉnh sửa thông tin sản phẩm</h5>
                      <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                      <form>
                        <div class="mb-1">
                          <label for="recipient-name" class="col-form-label">Mã sản phẩm:</label>
                          <input type="text" value="${item.idpduct}" class="form-control" id="recipient-name">
                        </div>
                        <div class="mb-1">
                          <label for="recipient-name" class="col-form-label">Tên sản phẩm:</label>
                          <input type="text" value="${item.productName}" class="form-control" id="recipient-name">
                        </div>
                        <div class="mb-1">
                          <label for="recipient-name" class="col-form-label">Thương hiệu:</label>
                          <input type="text" value="${item.trademark}" class="form-control" id="recipient-name">
                        </div>
                        <div class="mb-1">
                          <label for="recipient-name" class="col-form-label">Giá bán:</label>
                          <input type="text" value="${item.price}" class="form-control" id="recipient-name">
                        </div>
                        <div class="mb-1">
                          <label for="recipient-name" class="col-form-label">Hình ảnh:</label>
                          <form action="/action_page.php">
                              <input type="file" id="myFile"  name="filename">
                          </form>
                        </div>

                      </form>
                    </div>
                    <div class="modal-footer">
                      <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancel</button>
                      <button type="button" class="btn btn-primary">Save</button>
                    </div>
                  </div>
                </div>
              </div>
        <button type="button" class="btn" data-bs-toggle="modal" data-bs-target="#exampleModal1">
            <span><i class="text-danger ${item.icondete}"></i></span>
            </button>
            <div class="modal fade" id="exampleModal1" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
              <div class="modal-dialog">
                <div class="modal-content">
                  <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Xóa sản phẩm</h5>
                  </div>
                  <div class="modal-body">
                  Bạn có muốn xóa sản phẩm này không ?
                  </div>
                  <div class="modal-footer">
                    <button type="button" class="btn btn-primary" data-bs-dismiss="modal">Trở về</button>
                    <button type="button" class="btn btn-danger">Xóa</button>
                  </div>
                </div>
              </div>
            </div>
      </tr>
`
  );
})
document.getElementById('tabel-product').innerHTML = product.join(" ");
