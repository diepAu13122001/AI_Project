const products = [
  {
    index: "1",
    idpduct: "NT023",
    productName: "NAILS GIẢ VẼ NGHỆ THUẬT",
    trademark: "NNAIL",
    price: "99.900đ",
    image: "../image/mongtaynghethuat11.jpg",
    iconeye: "bi bi-eye-fill",
    icondetail: "bi bi-pencil-fill",
    icondete: "bi bi-trash-fill",
  },
  {
    index: "2",
    idpduct: "DD321",
    productName: "NAILS GIẢ ĐÍNH ĐÁ BẠCH KIM",
    trademark: "NNAIL",
    price: "69.000đ",
    image: "../image/mongtaydinhda1.jpg",
    iconeye: "bi bi-eye-fill",
    icondetail: "bi bi-pencil-fill",
    icondete: "bi bi-trash-fill",
  },
  {
    index: "3",
    idpduct: "DD222",
    productName: "NAILS GIẢ ĐÍNH ĐÁ LỚN",
    trademark: "NNAIL",
    price: "69.000đ",
    image: "../image/sonmongkimtuyen.jpg",
    iconeye: "bi bi-eye-fill",
    icondetail: "bi bi-pencil-fill",
    icondete: "bi bi-trash-fill",
  },
  {
    index: "4",
    idpduct: "NT001",
    productName: "NAILS GIẢ VẼ NGHỆ THUẬT ĐƠN GIẢN",
    trademark: "NNAIL",
    price: "49.900đ",
    image: "../image/mongtaynghethuat8.jpg",
    iconeye: "bi bi-eye-fill",
    icondetail: "bi bi-pencil-fill",
    icondete: "bi bi-trash-fill",
  },
  {
    index: "5",
    idpduct: "NT310",
    productName: "NAILS GIẢ VẼ NGHỆ THUẬT PHỦ BỘT KIM TUYẾN",
    trademark: "NNAIL",
    price: "49.900đ",
    image: "../image/mongtaynghethuat5.jpg",
    iconeye: "bi bi-eye-fill",
    icondetail: "bi bi-pencil-fill",
    icondete: "bi bi-trash-fill",
  },
  {
    index: "6",
    idpduct: "TS002",
    productName: "NAILS GIẢ TRONG SUỐT LẤP LÁNH",
    trademark: "NNAIL",
    price: "36.000đ",
    image: "../image/mongtaytrongsuot1.jpg",
    iconeye: "bi bi-eye-fill",
    icondetail: "bi bi-pencil-fill",
    icondete: "bi bi-trash-fill",
  },
  {
    index: "7",
    idpduct: "CDD213",
    productName: "BỘ 24 MÓNG CHÂN GIẢ ĐÍNH ĐÁ TONE ĐỎ",
    trademark: "NNAIL",
    price: "39.950đ",
    image: "../image/mongchandinhda1.jpg",
    iconeye: "bi bi-eye-fill",
    icondetail: "bi bi-pencil-fill",
    icondete: "bi bi-trash-fill",
  },
  {
    index: "8",
    idpduct: "CNT133",
    productName: "TOENAILS GIẢ VẼ TRANG TRÍ NGHỆ THUẬT",
    trademark: "NNAIL",
    price: "49.950đ",
    image: "../image/mongchannghethuat1.jpg",
    iconeye: "bi bi-eye-fill",
    icondetail: "bi bi-pencil-fill",
    icondete: "bi bi-trash-fill",
  },
  {
    index: "9",
    idpduct: "CNT020",
    productName: "TOENAILS GIẢ TONE TÍM SẪM KẺ SỌC",
    trademark: "NNAIL",
    price: "49.300đ",
    image: "../image/nailadmin.jpg",
    iconeye: "bi bi-eye-fill",
    icondetail: "bi bi-pencil-fill",
    icondete: "bi bi-trash-fill",
  },
  {
    index: "10",
    idpduct: "DD071",
    productName: "NAILS GIẢ ĐÍNH ĐÁ MÀU TRẮNG SANG TRỌNG CHO CÔ DÂU",
    trademark: "NNAIL",
    price: "109.000đ",
    image: "../image/mongtaydinhda4.jpg",
    iconeye: "bi bi-eye-fill",
    icondetail: "bi bi-pencil-fill",
    icondete: "bi bi-trash-fill",
  },
  {
    index: "11",
    idpduct: "NT031",
    productName: "NAILS GIẢ HIGHLIGHT TONE ĐỎ RƯỢU",
    trademark: "NNAIL",
    price: "49.900đ",
    image: "../image/mongtaynghethuat3.jpg",
    iconeye: "bi bi-eye-fill",
    icondetail: "bi bi-pencil-fill",
    icondete: "bi bi-trash-fill",
  },
  {
    index: "12",
    idpduct: "CNT551",
    productName: "TOENAILS GIẢ BÓNG GƯƠNG BẮT SÁNG",
    trademark: "NNAIL",
    price: "51.000đ",
    image: "../image/mongchanadmin.jpg",
    iconeye: "bi bi-eye-fill",
    icondetail: "bi bi-pencil-fill",
    icondete: "bi bi-trash-fill",
  },
  {
    index: "13",
    idpduct: "CDD661",
    productName: "TOENAILS GIẢ TONE TÍM TRONG ĐÍNH ĐÁ",
    trademark: "NNAIL",
    price: "79.000đ",
    image: "../image/mongchantimdep.jpg",
    iconeye: "bi bi-eye-fill",
    icondetail: "bi bi-pencil-fill",
    icondete: "bi bi-trash-fill",
  },
  {
    index: "14",
    idpduct: "NT131",
    productName: "NAILS GIẢ NGHỆ THUẬT XANH NGỌC SẮC SẢO",
    trademark: "NNAIL",
    price: "150.000đ",
    image: "../image/mongtaynghethuat15.jpg",
    iconeye: "bi bi-eye-fill",
    icondetail: "bi bi-pencil-fill",
    icondete: "bi bi-trash-fill",
  },
  {
    index: "15",
    idpduct: "MN403",
    productName: "NAILS GIẢ MÀU XANH NHÁM QUYẾN RŨ",
    trademark: "NNAIL",
    price: "49.000đ",
    image: "../image/mongtaynham81.jpg",
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
