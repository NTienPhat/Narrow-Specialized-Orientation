<%-- 
    Document   : HomePage_IT
    Created on : Jun 23, 2022, 1:41:13 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Kỹ Thuật Phần Mềm</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <link rel="stylesheet" href="css/homepagecss.css">
        <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
    </head>
    <body>
        <%@include file="Header_HomePage.jsp" %>
        <div id="myCarousel" class="carousel item" data-ride="carousel">
            <div class="carousel-inner">
                <div class="item active">
                    <img src="images/it.jpg" alt="IT">
                    <div class="carousel-caption">
                        <h3 class="hcaption-carousel">KỸ THUẬT PHẦN MỀM</h3>
                        <div class="caption-carousel">
                            <p>Với sự hỗ trợ của phần mềm, các quy trình hoạt động tối ưu hóa,</p>
                            <p>con người được giải phóng khỏi những công việc thủ công nhàm</p>
                            <p>chán, giảm thiểu sai sót, nâng cao năng suất và hiệu quả công</p>
                            <p>việc. Khi phần mềm được ứng dụng rộng và trở thành “hạt nhân”</p>
                            <p>cho sự phát triển của đời sống, sinh viên ngành Kỹ thuật Phần</p>
                            <p>mềm trở thành nhân tố được săn đón hàng đầu trên thị trường</p>
                            <p>lao động.</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div style="height: 15px; background-color: whitesmoke"></div>
        <div id="job" class="row d-flex justify-content-center">
            <div id="job-1" class="col-md-6">
                <h3>TRIỄN VỌNG NGHỀ NGHIỆP</h3>
                <div>
                    <p>
                        Hiện tại, sinh viên Đại học FPT đã và đang làm việc tại Mỹ, Đức, Nhật Bản, Singapore –
                        những thị trường Công nghệ Thông tin hàng đầu của thế giới.
                        Tốt nghiệp ngành Kỹ thuật Phần mềm, sinh viên trở thành Chuyên viên giải pháp phần mềm;
                        Chuyên viên phân tích dữ liệu; Chuyên viên kiểm thử phần mềm; Chuyên viên đảm bảo chất 
                        lượng phần mềm; Chuyên viên phân tích nghiệp vụ sản phẩm phần mềm; Chuyên viên phát triển 
                        ứng dụng di động. Sinh viên là những Kỹ sư lập trình, Kỹ sư phát triển hệ thống nhúng tương 
                        lai tại các doanh nghiệp phần mềm, doanh nghiệp ứng dụng Công nghệ Thông tin vào vận hành.
                    </p>
                </div>
            </div>
            <div id="job-2" class="col-md-3">
                <h3>HỌC NGÀNH NÀY LÀM NGHỀ GÌ?</h3>
                <div>
                    <ul>
                        <li>Giám đốc kỹ thuật</li>
                        <li>Quản lý dự án (PM)</li>
                        <li>Lập trình viên (Coder)</li>
                        <li>Kỹ sư cầu nối (BrSE)</li>
                        <li>Kiểm thử phần mềm (Tester)</li>
                        <li>Kỹ sư đảm bảo chất lượng phần mềm</li>
                        <li>Quản lý dự án Công nghệ Thông tin</li>
                        <li>Quản lý kỹ thuật</li>
                        <li>Quản trị viên dự án phần mềm và CNTT</li>
                    </ul>
                </div>
            </div>
        </div>
        
        <div style="height: 15px; background-color: whitesmoke"></div>
        
        <div class="why">
            <h3>VÌ SAO HƠN 50.000 SINH VIÊN LỰA CHỌN ĐH FPT?</h3>
            <div class="row d-flex justify-content-center">
                <div class="col-md-3">
                    <div class="row">
                        <div class="col-md-4" style="color: #f86c24">
                            <img style="width: 70%" src="images/gif1.gif">
                        </div>
                        <div class="col-md-8">
                            <span id="percent" class="count">100%</span>
                            <p>Sinh viên được nhà tuyển dụng chào đón</p>
                        </div>
                    </div>  
                </div>

                <div class="col-md-3">
                    <div class="row">
                        <div class="col-md-4">
                            <img style="width: 70%" src="images/gif2.gif">
                        </div>
                        <div class="col-md-8">
                            <p id="percent">100%</p>
                            <p>Sinh viên được học tập bằng tiếng Anh</p>
                        </div>
                    </div>  
                </div>

                <div class="col-md-3">
                    <div class="row">
                        <div class="col-md-4">
                            <img style="width: 70%" src="images/gif3.gif">
                        </div>
                        <div class="col-md-8">
                            <p id="percent">100%</p>
                            <p>Sinh viên có học kỳ nước ngoài và trải nghiệm quốc tế</p>
                        </div>
                    </div>  
                </div>
            </div>

            <div class="row d-flex justify-content-center">
                <div class="col-md-3">
                    <div class="row">
                        <div class="col-md-4">
                            <img style="width: 70%" src="images/gif4.gif">
                        </div>
                        <div class="col-md-8">
                            <p id="percent">10%</p>
                            <p>Cựu sinh viên làm việc tại nước ngoài</p>
                        </div>
                    </div>  
                </div>

                <div class="col-md-3">
                    <div class="row">
                        <div class="col-md-4">
                            <img style="width: 70%" src="images/gif5.gif">
                        </div>
                        <div class="col-md-8">
                            <p id="percent">9.8%</p>
                            <p>Cựu sinh viên trở thành lãnh đạo, quản lý</p>
                        </div>
                    </div>  
                </div>

                <div class="col-md-3">
                    <div class="row">
                        <div class="col-md-4">
                            <img style="width: 70%" src="images/gif6.gif">
                        </div>
                        <div class="col-md-8">
                            <p id="percent">5%</p>

                            <p>Sinh viên khởi nghiệp</p>
                        </div>
                    </div>  
                </div>
            </div>
        </div>
        
        <div style="height: 15px; background-color: whitesmoke"></div>
        
        <div id="route" class="row d-flex justify-content-center">
            <div id="route-1" class="col-md-5">
                <h3>LỘ TRÌNH ĐÀO TẠO</h3>
                3 năm
                (3 học kỳ/ năm)
                <img src="images/route.jpg" class="img-fluid" alt="Responsive image">
            </div>
            <div id="route-2" class="col-md-4">
                <h3>ĐÀO TẠO KHÁC BIỆT</h3>
                <p>
                    Với lợi thế là thành viên của tập đoàn công nghệ FPT, sinh viên Đại 
                    học FPT được tiếp cận nhanh chóng với xu hướng phát triển thế giới. 
                    Chương trình đào tạo cử nhân ngành Kỹ thuật Phần mềm tại Đại học FPT 
                    được thiết kế căn cứ chuẩn ACM, ABET, VINASA (*), các chuẩn học thuật -
                    nghề nghiệp toàn cầu với sự tư vấn của các chuyên gia và doanh nghiệp 
                    danh tiếng như Tập đoàn FPT, Tập đoàn IBM… Chương trình đào tạo chuyên
                    ngành Kỹ thuật Phần mềm của Đại học FPT tích hợp kiến thức và kỹ năng, 
                    sinh viên nhanh chóng thích nghi nhanh chóng với môi trường doanh nghiệp.
                </p>
                <p>
                    Đội ngũ Giảng viên có kinh nghiệm và chuyên môn cao với trình độ Tiến sĩ, Thạc sĩ. 
                    Lãnh đạo ưu tú của các doanh nghiệp phần mềm danh tiếng là diễn giả trong các hội thảo,
                    cố vấn trong các cuộc thi tại Đại học FPT. 100% sinh viên tham gia Học kỳ Đào tạo trong 
                    doanh nghiệp và thực hiện Khoá luận tốt nghiệp. Sinh viên ngành Kỹ thuật Phần mềm tại Đại
                    học FPT thông thạo Tiếng Anh và Tiếng Nhật, sẵn sàng cho sự nghiệp toàn cầu. Sinh viên đạt
                    trình độ tiếng Anh tối thiểu tương đương IELTS 6.0 trước khi bước vào Học kỳ chuyên ngành,
                    Học kỳ đào tạo trong doanh nghiệp.
                </p>
                <p style="font-size: small;">(*) ACM: Association for Computing Machinery.</p>
                <p style="font-size: small;">ABET: Accreditation Board for Engineering and Technology.</p>
                <p style="font-size: small;">VINASA: Hiệp hội Phần mềm Việt Nam.</p>
            </div>  
        </div>

        <div style="height: 15px; background-color: whitesmoke"></div>

        <div id="narrow" class="row d-flex justify-content-center">

            <h3>CHUYÊN NGÀNH HẸP NGÀNH CÔNG NGHỆ THÔNG TIN</h3>

            <div class="col-md-2 list-major">

                <h4>DANH SÁCH CHUYÊN NGÀNH HẸP</h4>
                <ul class="nav nav-tabs p-3 ">
                    <li class="nav-item">
                        <a aria-selected="true" class="nav-link active font-weight-bold" href="#IT" role="tab" data-toggle="tab">Cross-platform với .NET</a>
                    </li>                   
                    <li class="nav-item">
                        <a class="nav-link font-weight-bold" href="#BA" role="tab" data-toggle="tab">Kỹ sư cầu nối Nhật</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link font-weight-bold" href="#EL"role="tab" data-toggle="tab">Autonomous Car</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link font-weight-bold" href="#JL" role="tab" data-toggle="tab">AI with Tensor Flow</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link font-weight-bold" href="#KL" role="tab" data-toggle="tab">React/NodeJS</a>
                    </li>
                </ul>

            </div> <!-- col-left -->

            <div id="narrowinfo" class="col-md-7">
                <h4>THÔNG TIN CHUYÊN NGÀNH HẸP</h4>
                <div class="table-wrapper-scroll-y my-custom-scrollbar-2">
                    <div class="tab-content">
                        <div selected role="tabpanel" class="tab-pane fade active show selected" id="IT">
                            <h5 class="font-weight-bold">Combo: Phát triển ứng dụng cross-platform với .NET</h5>
                            <table class="table" >
                                <thead>
                                    <tr>
                                        <th scope="col">Mã học phần</th>
                                        <th scope="col">Tên học phần</th>
                                        <th scope="col">Tiết</th>
                                        <th scope="col">Tín chỉ</th>
                                        <th scope="col">Học phần tiên quyết</th>
                                        <th scope="col">Thông tin</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <th scope="row">PRN211</th>
                                        <td>
                                            <ul>
                                                <li>Lập trình ứng dụng cross-platform cơ bản với .NET</li>
                                                <li>Basic Cross-Platform Application</li>
                                                <li>Programming With .NET</li>
                                            </ul>
                                        </td>
                                        <td>60</td>
                                        <td>3</td>
                                        <td>PRO192 & DBI202</td>
                                        <td style="text-align: center">
                                            <a target=”_blank” style="color: black;"href="https://flm.fpt.edu.vn/gui/role/student/SyllabusDetails?sylID=5821"><i class="fa-solid fa-arrow-up-right-from-square"></i></a>
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                            <h5 class="font-weight-bold">TỔNG QUAN VỀ .NET</h5>
                            <p>
                                -.NET hay còn được biết đến là Dotnet là một nền tảng (framework) cho phép lập trình viên sử
                                dụng để phát triển các ứng dụng, game, website. Nền tảng này được phát triển bởi Microsoft và 
                                chạy trên hệ điều hành Window. Bản chất .NET không phải một ngôn ngữ lập trình mà là một nền 
                                tảng. Nó cho phép các ngôn ngữ lập trình khác nhau (như C#, VB.Net) sử dụng để tạo ra các sản 
                                phẩm ứng dụng mobile hoặc web.
                            </p>
                            <p>
                                -Bản chất .NET không phải một ngôn ngữ lập trình mà là một nền tảng. Nó cho phép các ngôn ngữ lập trình khác nhau
                                (như C#, VB.Net) sử dụng để tạo ra các sản phẩm ứng dụng mobile hoặc web.
                            </p>
                            <h5 class="font-weight-bold">ƯU ĐIỂM</h5>
                            <ul>
                                <li>Tiết kiệm thời gian & chi phí, tăng hiệu suất</li>
                                <li>Tính bảo mật cao, giảm xung đột</li>
                                <li>Đa ngôn ngữ, đa nền tảng</li>
                                <li>Tận dụng các dịch vụ có sẵn</li>
                            </ul>
                        </div> <!-- IT -->

                        <div role="tabpanel" class="tab-pane fade show" id="BA">
                            <h5 class="font-weight-bold">Combo: Định hướng kỹ sư cầu nối Nhật</h5>
                            <h6>
                                Lưu ý: Nếu sinh viên chọn chuyên ngành này thì cơ sở sẽ tổ chức cho sinh viên  đi OJT tại Nhật. Nếu sinh 
                                viên không đồng ý với điều kiện này thì cơ sở không triển khai combo này. 
                            </h6>
                            <table class="table" >
                                <thead>
                                    <tr>
                                        <th scope="col">Mã học phần</th>
                                        <th scope="col">Tên học phần</th>
                                        <th scope="col">Tiết</th>
                                        <th scope="col">Tín chỉ</th>
                                        <th scope="col">Học phần tiên quyết</th>
                                        <th scope="col">Thông tin</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <th scope="row">JPD133</th>
                                        <td>
                                            <ul>
                                                <li>Tiếng Nhật sơ cấp 1-A1/A2</li>
                                                <li>ElementaryJapanese  1-A1/A2</li>
                                            </ul>
                                        </td>
                                        <td>60</td>
                                        <td>3</td>
                                        <td> JPD121 or JPD123</td>
                                        <td style="text-align: center">
                                            <a target=”_blank” style="color: black;"href="https://flm.fpt.edu.vn/gui/role/student/SyllabusDetails?sylID=2428"><i class="fa-solid fa-arrow-up-right-from-square"></i></a>
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                            <h5 class="font-weight-bold">TỔNG QUAN VỀ KỸ SƯ CẦU NỐI NHẬT</h5>
                            <p>
                                -Kỹ sư cầu nối hay còn được biết đến với tên gọi BrSE viết tắt của từ Bridge System Engineer. Hiểu một cách đơn giản kỹ sư cầu nối là một kỹ sư IT đứng ở giữa làm công việc kết nối giữa
                                khách hàng (customer) và đội phát triển (offshore) để truyền tải những yêu cầu của khách hàng đến đội ngũ phát triển, đảm bảo cho dự án đi đúng tiến độ và chất lượng.
                            </p>
                            <p>
                                -Kỹ sư cầu nối có thể đảm nhiệm rất nhiều công việc khác nhau từ phân tích yêu cầu của khách hàng (Business Analyst), viết tài liệu thiết kế, phát triển, cho đến vận hành hệ thống,….
                                Tuy nhiên không phải lúc nào BrSE cũng làm hết tất cả các việc trên. Tùy thuộc vào quy mô và tính chất của từng dự án mà công việc của BrSE sẽ khác nhau.
                            </p>
                            <h5 class="font-weight-bold">NHỮNG KỸ NĂNG CẦN CÓ</h5>
                            <ul>
                                <li>
                                    Kiến thức chuyên môn về kỹ thuật IT
                                </li>
                                <li>
                                    Khả năng ngoại ngữ
                                </li>
                                <li>
                                    Kỹ năng giao tiếp tốt
                                </li>
                                <li>
                                    Tinh thần trách nhiệm cao
                                </li>
                            </ul>
                        </div> <!-- BA -->

                        <div role="tabpanel" class="tab-pane fade show" id="EL">
                            <h5 class="font-weight-bold">Combo: Autonomous Car</h5>
                            <table class="table" >
                                <thead>
                                    <tr>
                                        <th scope="col">Mã học phần</th>
                                        <th scope="col">Tên học phần</th>
                                        <th scope="col">Tiết</th>
                                        <th scope="col">Tín chỉ</th>
                                        <th scope="col">Học phần tiên quyết</th>
                                        <th scope="col">Thông tin</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <th scope="row">PRP201c</th>
                                        <td>
                                            <ul>
                                                <li>Lập trình Python</li>
                                                <li>Python Programing</li>
                                            </ul>
                                        </td>
                                        <td>5</td>
                                        <td>3</td>
                                        <td>Không</td>
                                        <td style="text-align: center">
                                            <a target=”_blank” style="color: black;"href="https://flm.fpt.edu.vn/gui/role/student/SyllabusDetails?sylID=1181"><i class="fa-solid fa-arrow-up-right-from-square"></i></a>
                                        </td>
                                    </tr>
                                </tbody>
                            </table>    
                            <h5 class="font-weight-bold">TỔNG QUAN VỀ AUTONOMOUS CAR</h5>
                            <p>
                                -Công nghệ xe tự lái trong nước đã có những tín hiệu phát triển tích cực và ngày càng phù hợp với ngành giao thông thế hệ mới. Các hãng xe nội địa đang tận dụng nền khoa học -
                                kỹ thuật tiên tiến nhất để tạo ra đế chế xe tự lái “Made in Vietnam”. Doanh nghiệp Việt đang từng bước gia nhập thị trường xe tự lái để đón đầu cuộc cách mạng 4.0 và chinh phục “cơn lốc” phát triển công nghệ ô tô thế giới.
                            </p>
                            <p>
                                -Có thể thấy, FPT là công ty đầu tiên ra mắt công nghệ xe tự hành tại Việt Nam vào năm 2017 và là một trong số ít các công ty tiên phong trong lĩnh vực xe tự hành tại khu vực Đông Nam Á. 
                                FPT đã thử nghiệm thành công công nghệ xe tự hành trên xe ô tô thương mại 4 chỗ và dòng xe điện sân golf di chuyển trong khuôn viên khu công nghệ cao TP. HCM và khu campus FPT Complex tại Đà Nẵng.
                            </p>
                            
                        </div> <!-- EL -->

                        <div role="tabpanel" class="tab-pane fade show" id="JL">
                            <h5 class="font-weight-bold">Combo: AI with Tensor Flow</h5>
                            <table class="table" >
                                <thead>
                                    <tr>
                                        <th scope="col">Mã học phần</th>
                                        <th scope="col">Tên học phần</th>
                                        <th scope="col">Tiết</th>
                                        <th scope="col">Tín chỉ</th>
                                        <th scope="col">Học phần tiên quyết</th>
                                        <th scope="col">Thông tin</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <th scope="row">PRP201c</th>
                                        <td>
                                            <ul>
                                                <li>Lập trình Python</li>
                                                <li>Python Programing</li>
                                            </ul>
                                        </td>
                                        <td>5</td>
                                        <td>3</td>
                                        <td>Không</td>
                                        <td style="text-align: center">
                                            <a target=”_blank” style="color: black;"href="https://flm.fpt.edu.vn/gui/role/student/SyllabusDetails?sylID=1181"><i class="fa-solid fa-arrow-up-right-from-square"></i></a>
                                        </td>
                                    </tr>
                                </tbody>
                            </table> 
                            <h5 class="font-weight-bold">TỔNG QUAN VỀ AI WITH TENSORFLOW</h5>
                            <p>
                                -Với sự bùng nổ của lĩnh vực Trí Tuệ Nhân Tạo – A.I. trong thập kỷ vừa qua, machine learning và deep learning rõ ràng cũng phát triển theo cùng. Và ở thời điểm hiện tại, TensorFlow chính
                                là thư viện mã nguồn mở cho machine learning nổi tiếng nhất thế giới, được phát triển bởi các nhà nghiên cứu từ Google. Việc hỗ trợ mạnh mẽ các phép toán học để tính toán trong machine learning và deep learning đã giúp việc tiếp cận các bài toán trở nên đơn giản, nhanh chóng và tiện lợi hơn nhiều. 
                            </p>
                            <p>
                                -Được viết bằng C++ và thao tác interface bằng Python nên phần performance của TensorFlow cực kỳ tốt. Đối tượng sử dụng nó cũng đa dạng không kém: từ các nhà nghiên cứu, nhà khoa học dữ liệu và dĩ nhiên không thể thiếu các lập trình viên. 
                            </p>
                            <h5 class="font-weight-bold">ƯU ĐIỂM</h5>
                            <ul>
                                <li>
                                    Thể hiện góc nhìn tổng quan
                                </li>
                                <li>
                                    Dễ dàng chỉnh sửa định hướng
                                </li>
                                <li>
                                    Dựa trên một nền tảng mạnh mẽ – Google

                                </li>
                            </ul>
                        </div> <!-- JL -->

                        <div role="tabpanel" class="tab-pane fade show" id="KL">
                            <h5 class="font-weight-bold">Combo: React/NodeJS</h5>
                            <table class="table" >
                                <thead>
                                    <tr>
                                        <th scope="col">Mã học phần</th>
                                        <th scope="col">Tên học phần</th>
                                        <th scope="col">Tiết</th>
                                        <th scope="col">Tín chỉ</th>
                                        <th scope="col">Học phần tiên quyết</th>
                                        <th scope="col">Thông tin</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <th scope="row">FER201m</th>
                                        <td>
                                            <ul>
                                                <li>Phát triển web Front-End với React</li>
                                                <li>Front-End web development with React</li>
                                            </ul>
                                        </td>
                                        <td>60</td>
                                        <td>3</td>
                                        <td>WED201c</td>
                                        <td style="text-align: center">
                                            <a target=”_blank” style="color: black;"href="https://flm.fpt.edu.vn/gui/role/student/SyllabusDetails?sylID=5445"><i class="fa-solid fa-arrow-up-right-from-square"></i></a>
                                        </td>
                                    </tr>
                                </tbody>
                            </table> 
                            <h5 class="font-weight-bold">TỔNG QUAN VỀ REACT/NODE JS</h5>
                            <p>
                                -React JS đang là một trong những thư viện phổ biến nhất giới frontend. Sử dụng React Js để build các ứng dụng front-end với hiệu năng cao và thời gian xây dựng nhanh nhất có thể.
                            </p>
                            <p>
                                -Node.js là một hệ thống phần mềm được thiết kế để viết các ứng dụng internet có khả năng mở rộng, đặc biệt là máy chủ web. Chương trình được viết bằng JavaScript, sử dụng kỹ thuật điều khiển theo sự kiện, nhập/xuất không đồng bộ để tối thiểu tổng tài nguyên và tối đa khả năng mở rộng.
                                Node.js bao gồm có V8 JavaScript engine của Google, libUV, và vài thư viện khác. 
                            </p>
                            <h5 class="font-weight-bold">ƯU ĐIỂM</h5>
                            <ul>
                                <li>
                                    NodeJs viết bằng Javascript nên có cộng đồng hỗ trợ cực lớn, nên những vấn đề gặp phải sẽ nhận được sự support rộng rãi so với nhiều framework khác.
                                </li>
                                <li>
                                    Hiệu năng cao + real time: NodeJs với cơ chế xử lý bất đồng bộ - non-blocking giúp NodeJs tiếp nhận và xử lý hàng ngàn request một lúc mà không gặp một khó khăn nào.
                                </li>
                                <li>
                                    Dễ dàng mở rộng.
                                </li>
                                <li>
                                    JSON API - Với javascript thì NodeJS + Nosql làm server là sự lựa chọn số 1 cho JSON API.
                                </li>
                            </ul>
                        </div> <!-- KL -->

                    </div> <!-- Tab Content -->

                </div>
            </div><!-- col-right -->


        </div>
        
        <div style="height: 15px; background-color: whitesmoke"></div>

        <div id="program" class="row d-flex justify-content-center">
            <div class="col-md-9">
                <h3>CHƯƠNG TRÌNH ĐÀO TẠO</h3>
                <div class="table-wrapper-scroll-y my-custom-scrollbar">

                    <table class="table table-bordered ">
                        <thead>
                            <tr>
                                <th scope="col">HỌC KỲ</th>
                                <th scope="col">HỌC PHẦN</th>
                                <th scope="col">KỸ NĂNG ĐẠT ĐƯỢC</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <th scope="row">NỀN TẢNG</th>
                                <td>
                                    <ul>
                                        <li>Định hướng + Rèn luyện tập trung</li>
                                        <li>Phương pháp học Đại học hiệu quả</li>
                                        <li>Vovinam</li>
                                        <li>01-05 Level tiếng Anh</li>
                                        <li>Học kỳ tiếng Anh tại nước ngoài</li>
                                        <li>Nhạc cụ truyền thống</li>
                                    </ul>
                                </td>
                                <td>
                                    <ul>
                                        <li>
                                            Sinh viên có phương pháp học Đại học hiệu quả như: tự học, làm việc nhóm, 
                                            quản lý thời gian, tối ưu hoá năng lực não bộ cải thiện kết quả học tập.
                                        </li>
                                        <li>
                                            Sinh viên đạt trình độ tiếng Anh tương đương IELTS 6.0 hoặc TOEFL iBT 80.
                                        </li>
                                        <li>
                                            Sinh viên tự tin đọc hiểu giáo trình, học tập hoàn toàn bằng tiếng Anh,
                                            giao tiếp thông thạo với giảng viên và sinh viên quốc tế.
                                        </li>
                                        <li>
                                            Sinh viên có tinh thần rèn luyện thể chất, phát triển cá nhân toàn diện.
                                        </li>
                                        <li>
                                            Sinh viên tìm hiểu về giá trị của âm nhạc truyền thống, sinh viên có
                                            thể chơi một số nhạc cụ truyền thống như sáo, nhị, tỳ bà... Sinh viên tự tin
                                            hơn trước đám đông, rèn luyện những thói quen tốt: kiên trì và tỉ mỉ
                                        </li>
                                    </ul>
                                </td>
                            </tr>
                            <tr>
                                <th scope="row">1</th>
                                <td>
                                    <ul>
                                        <li>Nhập môn khoa học máy tính</li>
                                        <li>Tổ chức và Kiến trúc máy tính</li>
                                        <li>Cơ sở lập trình Toán cho ngành kỹ thuật</li>
                                        <li>Kỹ năng học tập đại học</li>
                                        <li>Vovinam 2</li>
                                    </ul>
                                </td>
                                <td>
                                    <ul>
                                        <li>
                                            Sinh viên có bức tranh tổng thể về CNTT thông qua các khái niệm cơ bản: 
                                            lịch sử phát triển, công cụ, kiến trúc phần cứng, phần mềm, hệ điều hành,
                                            mạng và Internet, cấu trúc dữ liệu...
                                        </li>
                                        <li>
                                            Sinh viên tìm hiểu về kiến trúc và tổ chức máy tính: bao gồm các chủ đề 
                                            về thiết kế vật lý của máy tính (tổ chức) và thiết kế lôgic của máy tính
                                            (kiến trúc).
                                        </li>

                                        <li>
                                            Sinh viên được học về các ngôn ngữ lập trình, ngôn ngữ C; quá trình phát
                                            triển phần mềm; lập trình căn bản dùng C.
                                        </li>
                                        <li>
                                            Sinh viên được tăng cường các kiến thức cơ bản của giải tích và đại số 
                                            tuyến tính và các ứng dụng của chúng trong khoa học, kỹ thuật. Sinh viên
                                            được trang bị phương pháp học đại học hiệu quả.
                                        </li>

                                    </ul>
                                </td>
                            </tr>
                            <tr>
                                <th scope="row">2</th>
                                <td>
                                    <ul>
                                        <li>Hệ điều hành</li>
                                        <li>Mạng máy tính</li>
                                        <li>Lập trình hướng đối tượng</li>
                                        <li>Toán rời rạc</li>
                                        <li>Kỹ năng giao tiếp và cộng tác</li>
                                        <li>Vovinam 3</li>
                                    </ul>
                                </td>
                                <td>
                                    <ul>
                                        <li>
                                            Sinh viên được giới thiệu về hệ điều hành, nắm được các kiến thức về hệ
                                            thống mạng máy tính, kiến trúc mạng, các mô hình tham chiếu, các giao thức
                                            , họ giao thức TCP/IP, một số kiến thức cơ bản về an ninh mạng.
                                        </li>
                                        <li>Sinh viên có kiến thức nền tảng toán học cho khoa học máy tính.</li>
                                        <li>
                                            Sinh viên được trang bị kỹ năng làm việc nhóm, bao gồm cả cách làm việc, 
                                            triển khai, trao đổi các chiến lược và giao tiếp trong nhóm hiệu quả.
                                        </li>
                                    </ul>
                                </td>
                            </tr>
                            <tr>
                                <th scope="row">3</th>
                                <td>
                                    <ul>
                                        <li>Các hệ cơ sở dữ liệu</li>
                                        <li>Thiết kế Web</li>
                                        <li>Thực hành OOP với Java</li>
                                        <li>Cấu trúc dữ liệu và giải thuật</li>
                                        <li>Ngoại ngữ 2 : Tiếng Nhật 1</li>
                                    </ul>
                                </td>
                                <td>
                                    <ul>
                                        <li>
                                            Sinh viên có kiến thức về các hệ cơ sở dữ liệu với các mô hình cơ sở 
                                            dữ liệu quan hệ.
                                        </li>
                                        <li>
                                            Sinh viên hiểu về Ngôn ngữ Đánh dấu Siêu văn bản để tạo các trang 
                                            web, Cascading Style Sheets, Javascript.
                                        </li>
                                        <li>
                                            Sinh viên được thực hành các bài lập trình hướng đối tượng với 
                                            ngôn ngữ Java.
                                        </li>
                                        <li>
                                            Sinh viên nắm vững các khái niệm cơ bản về cấu trúc dữ liệu và các 
                                            thuật toán được cài đặt cho các cấu trúc dữ liệu, sử dụng ngôn ngữ 
                                            Java để minh họa.
                                        </li>
                                        <li>
                                            Sinh viên sử dụng Tiếng Nhật ở mức độ căn bản: đọc, viết, giao 
                                            tiếp ở môi trường làm việc.
                                        </li>
                                    </ul>
                                </td>
                            </tr>
                            <tr>
                                <th scope="row">4</th>
                                <td>
                                    <ul>
                                        <li>Phát triển ứng dụng Java web</li>
                                        <li>Nhập môn kỹ thuật phần mềm</li>
                                        <li>Internet vạn vật</li>
                                        <li>Xác suất thống kê</li>
                                        <li>Ngoại ngữ 2 : Tiếng Nhật 2</li>
                                    </ul>
                                </td>
                                <td>
                                    <ul>
                                        <li>
                                            Sinh viên biết cách xây dựng các ứng dụng web phức tạp trong môi 
                                            trường doanh nghiệp, được giới thiệu về Java Enterprise Edition.
                                        </li>
                                        <li>
                                            Sinh viên có kiến thức chung về các tiến trình và vòng đời trong 
                                            Kỹ thuật phần mềm và quản lý các dự án.
                                        </li>
                                        <li>
                                            Sinh viên được tiếp cận với các kiến thức cơ bản của Internet vạn vật.
                                        </li>
                                        <li>
                                            Sinh viên sử dụng Tiếng Nhật ở mức độ nâng cao: đọc, viết, giao tiếp
                                            ở môi trường làm việc.
                                        </li>
                                    </ul>
                                </td>
                            </tr>
                            <tr>
                                <th scope="row">5</th>
                                <td>
                                    <ul>
                                        <li>Lập trình di động</li>
                                        <li>Yêu cầu phần mềm</li>
                                        <li>Kiểm thử phần mềm</li>
                                        <li>Quản trị dự án</li>
                                        <li>Đạo đức trong CNTT</li>
                                    </ul>
                                </td>
                                <td>
                                    <ul>
                                        <li>
                                            Sinh viên có đủ kiến thức cơ bản về lập trình Android để sinh
                                            viên có thể phát triển các ứng dụng hữu ích cũng như tự học thêm
                                            dễ dàng hơn.
                                        </li>
                                        <li>
                                            Sinh viên biết cách Quản trị dự án nói chung và dự án CNTT nói
                                            riêng một cách hiệu quả.</li>
                                        <li>
                                            Sinh viên nắm vững các vấn đề liên quan đến đạo đức của người 
                                            làm CNTT và người dùng CNTT, sở hữu trí tuệ, an toàn và bảo mật,
                                            tội phạm máy tính và Internet…
                                        </li>
                                    </ul>
                                </td>
                            </tr>
                            <tr>
                                <th scope="row">6</th>
                                <td>
                                    <ul>
                                        <li>Thực tập làm việc thực tế tại doanh nghiệp</li>
                                    </ul>
                                </td>
                                <td>
                                    <ul>
                                        <li>
                                            Sinh viên làm việc thực tế từ 4 – 8 tháng tại các công ty thành 
                                            viên thuộc tập đoàn FPT hoặc hơn 300 doanh nghiệp là đối tác của 
                                            tập đoàn FPT trên toàn thế giới.
                                        </li>
                                    </ul>
                                </td>
                            </tr>
                            <tr>
                                <th scope="row">7</th>
                                <td>
                                    <ul>
                                        <li>UI/IX</li>
                                        <li>Kiến trúc và Thiết kế phần mềm</li>
                                        <li>Phương pháp nghiên cứu</li>
                                        <li>Môn chuyên ngành tự chọn 1</li>
                                        <li>Môn chuyên ngành tự chọn 2</li>
                                    </ul>
                                </td>
                                <td>
                                    <ul>
                                        <li>
                                            Sinh viên hiểu rõ nguyên tắc tâm lý của giao tiếp người máy, Đánh giá 
                                            giao diện người sử dụng. Phân tích nhiệm vụ, thiết kế hướng người sử 
                                            dụng, mô hình hóa và các công nghệ liên quan.
                                        </li>
                                        <li>
                                            Sinh viên nắm vững các phương pháp luận quan trọng về thiết kế phần 
                                            mềm, các kiểu kiến trúc phần mềm, hướng dẫn thiết kế và công cụ thiết
                                            kế.
                                        </li>
                                        <li>
                                            Sinh viên được trang bị một số phương pháp nghiên cứu hữu ích, 
                                            điểm mạnh và điểm yếu của các phương pháp luận, các thức thiết kế 
                                            và thực hiện dự án nghiên cứu để sinh viên có thể tự thực hiện các 
                                            dự án nghiên cứu sau này.
                                        </li>
                                    </ul>
                                </td>
                            </tr>
                            <tr>
                                <th scope="row">8</th>
                                <td>
                                    <ul>
                                        <li>Dự án phát triển ứng dụng</li>
                                        <li>Môn chuyên ngành tự chọn 3</li>
                                        <li>Môn chuyên ngành tự chọn 4</li>
                                    </ul>
                                </td>
                                <td>
                                    <ul>
                                        <li>
                                            Sinh viên có kiến thức của vai trò Quản lý dự án như: Lập kế hoạch, 
                                            dự đoán các rủi ro, điều phối nhân lực và chia công việc. Ngoài ra, 
                                            các kiến thức về quản lý nhân sự, phối hợp nhân viên, xử lý xung đột 
                                            sẽ được cung cấp để nâng cao kinh nghiệm cho việc quản lý. 
                                        </li>
                                    </ul>
                                </td>
                            </tr>
                            <tr>
                                <th scope="row">9</th>
                                <td>
                                    <ul>
                                        <li>Khóa luận tốt nghiệp</li>
                                        <li>Khởi sự doanh nghiệp</li>
                                    </ul>
                                </td>
                                <td>
                                    <ul>
                                        <li>
                                            Sinh viên thực hiện và sở hữu đồ án/ứng dụng/mô hình kinh doanh 
                                            dịch vụ của riêng mình.
                                        </li>
                                        <li>Sinh viên tự tin làm việc tại hầu hết các quốc gia trên thế giới.</li>
                                    </ul>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>

        <div style="height: 20px; background-color: whitesmoke"></div>



        <%@include file="Footer_HomePage.jsp" %>
        <script src="https://use.fontawesome.com/releases/v6.1.1/js/all.js" crossorigin="anonymous"></script>
    </body>
</html>
