const products = [
  {
    index: "1",
    idpduct: "PK111",
    productName: "PHỤ KIỆN CHARM GẮN MÓNG HÌNH BƯỚM",
    trademark: "NNAIL",
    price: "25.000đ",
    image: "../image/dadinhnails1.jpg",
    iconeye: "bi bi-eye-fill",
    icondetail: "bi bi-pencil-fill",
    icondete: "bi bi-trash-fill",
  },
  {
    index: "2",
    idpduct: "HD511",
    productName: "PHỤ KIỆN ĐÁ ĐÍNH HẠT LÊN NAILS SIÊU BẮT MẮT",
    trademark: "NNAIL",
    price: "69.000đ",
    image: "../image/dadinhnails2.jpg",
    iconeye: "bi bi-eye-fill",
    icondetail: "bi bi-pencil-fill",
    icondete: "bi bi-trash-fill",
  },
  {
    index: "3",
    idpduct: "BN424",
    productName: "BỘT NHUNG PHỦ MÓNG SIÊU ĐẸP",
    trademark: "NNAIL",
    price: "59.900đ",
    image: "../image/botnhungmong.jpg",
    iconeye: "bi bi-eye-fill",
    icondetail: "bi bi-pencil-fill",
    icondete: "bi bi-trash-fill",
  },
  {
    index: "4",
    idpduct: "MD610",
    productName: "BỘ MIẾNG DÁN MÓNG SIÊU ĐẸP HOT TREND",
    trademark: "NNAIL",
    price: "9.900đ",
    image: "../image/phukiendinhmong.jpg",
    iconeye: "bi bi-eye-fill",
    icondetail: "bi bi-pencil-fill",
    icondete: "bi bi-trash-fill",
  },
  {
    index: "5",
    idpduct: "NT310",
    productName: "HỘP PHỤ KIỆN TRANG TRÍ MÓNG TAY ĐA DẠNG",
    trademark: "NNAIL",
    price: "49.900đ",
    image: "../image/phukien1.jpg",
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
