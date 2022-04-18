const products = [
  {
    index: "1",
    idpduct: "DC132",
    productName: "BỘ DŨA MÓNG TAY NHIỀU HÌNH/NHIỀU MÀU",
    trademark: "NNAIL",
    price: "9.300đ",
    image: "../image/duamong.jpg",
    iconeye: "bi bi-eye-fill",
    icondetail: "bi bi-pencil-fill",
    icondete: "bi bi-trash-fill",
  },
  {
    index: "2",
    idpduct: "DC613",
    productName: "CỌ VẼ NAILS NÉT SIÊU NHỎ CỰC DỄ VẼ TẠI NHÀ",
    trademark: "NNAIL",
    price: "8.900đ",
    image: "../image/conails.jpg",
    iconeye: "bi bi-eye-fill",
    icondetail: "bi bi-pencil-fill",
    icondete: "bi bi-trash-fill",
  },
  {
    index: "3",
    idpduct: "DC719",
    productName: "BỘ DỤNG CỤ LÀM MÓNG ĐA NĂNG 12 MÓN",
    trademark: "NNAIL",
    price: "219.000đ",
    image: "../image/bokiem.jpg",
    iconeye: "bi bi-eye-fill",
    icondetail: "bi bi-pencil-fill",
    icondete: "bi bi-trash-fill",
  },
  {
    index: "4",
    idpduct: "DN901",
    productName: "MÁY SẤY KHÔ MÓNG TAY SUN 5",
    trademark: "NNAIL",
    price: "550.900đ",
    image: "../image/bomay.jpg",
    iconeye: "bi bi-eye-fill",
    icondetail: "bi bi-pencil-fill",
    icondete: "bi bi-trash-fill",
  },
  {
    index: "5",
    idpduct: "DC552",
    productName: "KỆ ĐỂ CHÂN LÀM NAILS CÓ NGĂN KÉO",
    trademark: "NNAIL",
    price: "232000đ",
    image: "../image/banmong.jpg",
    iconeye: "bi bi-eye-fill",
    icondetail: "bi bi-pencil-fill",
    icondete: "bi bi-trash-fill",
  },
  {
    index: "6",
    idpduct: "CO150",
    productName: "CỌ CHẤM BI VẼ MÓNG DAMASK",
    trademark: "DAMASK",
    price: "100.000đ",
    image: "../image/colorvit.jpg",
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
