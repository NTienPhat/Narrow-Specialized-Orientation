<%-- 
    Document   : HomePage_TTDPT
    Created on : Jul 13, 2022, 8:21:48 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Truyền Thông Đa Phương Tiện</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <link rel="stylesheet" href="css/homepagecss.css">
        <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
    </head>
    <body>
        <%@include file="Header_HomePage.jsp" %>
        <div id="myCarousel" class="carousel item" data-ride="carousel">
            <div class="carousel-inner">
                <div class="item active">
                    <img src="images/ttdpt.jpg" alt="IT">
                    <div class="carousel-caption">
                        <h3 class="hcaption-carousel">TRUYỀN THÔNG ĐA PHƯƠNG TIỆN</h3>
                        <div class="caption-carousel">
                            <p>Với sự phát triển của xã hội, ngành Truyền thông Đa phương tiện - ngành tích hợp kiến thức</p>
                            <p>giữa báo chí truyền thông và công nghệ thông tin đang là một trong những ngành được đánh</p>
                            <p>giá cao bởi nhu cầu thị trường nhân lực phát triển.</p>
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
                        Sinh viên tốt nghiệp ngành Truyền thông Đa phương tiện làm việc tại các cơ quan
                        báo chí - truyền thông; Cơ quan, tổ chức, doanh nghiệp thuộc các lĩnh vực như: 
                        thiết kế, quảng cáo, điện ảnh, các cơ quan báo chí, phát thanh - truyền hình,
                        viễn thông, phát triển công nghệ thông tin-truyền thông; Hội nhà báo Việt Nam;
                        Hội truyền thông số Việt Nam; Công ty Quan hệ công chúng (PR) và quảng cáo, các 
                        công ty tổ chức kinh doanh truyền thông số, phát triển ứng dụng truyền thông đa 
                        phương tiện,…
                    </p>
                    <p>Tại các cơ sở đào tạo, nghiên cứu, tập huấn liên quan đến Truyền thông Đa 
                        phương tiện, sinh viên trở thành Phóng viên (đa phương tiện); Biên tập viên
                        quảng cáo; Chuyên viên truyền thông; Chuyên viên nội dung; Quản trị các kênh
                        truyền thông trực tuyến; Chuyên viên Marketing trực tuyến; Chuyên viên/giám 
                        đốc tổ chức sự kiện; Chuyên viên đối ngoại và quan hệ công chúng; Nhà nghiên
                        cứu; Chuyên viên quản lý mạng xã hội; Cán bộ giảng dạy, cán bộ nghiên cứu
                        tại các trường đại học, cao đẳng và viện nghiên cứu; Giám đốc sản xuất, giám
                        đốc sáng tạo, đạo diễn, phóng viên, biên tập viên truyền hình, chuyên viên
                        truyền thông tổng hợp, chuyên viên quảng cáo, chuyên viên chăm sóc khách 
                        hàng, chuyên viên quản trị web, chuyên viên quản lý sự kiện, chuyên viên
                        mạng xã hội, chuyên viên quan hệ công chúng,… </p>
                </div>
            </div>
            <div id="job-2" class="col-md-3">
                <h3>HỌC NGÀNH NÀY LÀM NGHỀ GÌ?</h3>
                <div>
                    <ul>
                        <li>Giám đốc Sản xuất, Giám đốc Sáng tạo, Đạo diễn</li>
                        <li>Biên tập viên báo chí/ đài truyền hình</li>
                        <li>Phóng viên</li>
                        <li>Quản trị truyền thông trực tuyến</li>
                        <li>Chuyên viên sản xuất Video</li>
                        <li>Chuyên viên quản trị mạng xã hội (Admin)</li>
                        <li>Chuyên viên đối ngoại và quan hệ công chúng (PR)</li>
                        <li>Chuyên viên Marketing trực tuyến/ quảng cáo</li>
                        <li>Chuyên viên Tổ chức sự kiện</li>
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
                    Tại Đại học FPT, sinh viên ngành Truyền thông Đa phương tiện được đào tạo kiến thức, thẩm mĩ
                    và kỹ năng sử dụng ngôn từ, hình ảnh, âm thanh cùng kỹ năng tạo lập nội dung trong quá trình 
                    sản xuất các sản phẩm truyền thông theo chuẩn quốc tế, đáp ứng mọi nhu cầu khắt khe của thị 
                    trường.
                </p>
                <p>
                    Chương trình đào tạo theo chuẩn quốc tế, sử dụng giáo trình toàn cầu, cập nhật
                    xu hướng với sự tham vấn của các chuyên gia hàng đầu trong ngành. Sinh viên đạt
                    trình độ tiếng Anh tối thiểu tương đương IELTS 6.0 trước khi bước vào chương 
                    trình học tập chuyên ngành với những trải nghiệm thực tế và hội nhập quốc tế,
                    các học kỳ Tiếng Anh và chuyên ngành tại nước ngoài và chương trình đào tạo 
                    trong doanh nghiệp. 100% sinh viên được đào tạo tiếng Trung song song với tiếng
                    Anh.
                </p>
                <p>
                    Sinh viên được học tập với cơ sở vật chất hiện đại, đầy đủ chức năng, thiết bị
                    tác nghiệp: studio chụp hình, studio quay phim, studio livestream, studio phát
                    thanh ngay trong campus. Cơ hội trải nghiệm, làm việc thực tế tại các nhà sản 
                    xuất và cung cấp nội dung truyền thông, giải trí uy tín như Cát Tiên Sa, Điền
                    Quân, Yan, Yeah1… giúp sinh viên tích lũy kỹ năng và kinh nghiệm thực tiễn, 
                    mở ra cơ hội nghề nghiệp.
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
                                .NET hay còn được biết đến là Dotnet là một nền tảng (framework) cho phép lập trình viên sử
                                dụng để phát triển các ứng dụng, game, website. Nền tảng này được phát triển bởi Microsoft và 
                                chạy trên hệ điều hành Window. Bản chất .NET không phải một ngôn ngữ lập trình mà là một nền 
                                tảng. Nó cho phép các ngôn ngữ lập trình khác nhau (như C#, VB.Net) sử dụng để tạo ra các sản 
                                phẩm ứng dụng mobile hoặc web.
                            </p>
                            <p>
                                Bản chất .NET không phải một ngôn ngữ lập trình mà là một nền tảng. Nó cho phép các ngôn ngữ lập trình khác nhau
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
                                        <li>Kỹ năng học tập đại học</li>
                                        <li>Nhập môn quản lý</li>
                                        <li>Nguyên lý Marketing</li>
                                        <li>Các loại hình truyền thông đương đại</li>
                                        <li>Tâm lý học truyền thông</li>
                                        <li>Vovinam 2</li>
                                    </ul>
                                </td>
                                <td>
                                    <ul>
                                        <li>
                                            Sinh viên học cách làm việc nhóm hiệu quả, phát triển nhóm, thành viên nhóm, đa 
                                            dạng nhóm, lãnh đạo nhóm, mâu thuẫn và gắn kết trong các nhóm, lập kế hoạch và tổ 
                                            chức các cuộc họp công nghệ và các nhóm ảo. 
                                        </li>
                                        <li>
                                            Sinh viên nắm vững 5 hoạt động chính của Marketing bao gồm: xác định nhu cầu của
                                            khách hàng, cung cấp cho khách hàng các sản phẩm phù hợp, kênh phân phối phù hợp,
                                            thúc đẩy việc mua hàng hiệu quả và định giá tối đa hoá lợi nhuận.
                                        </li>

                                        <li>
                                            Sinh viên nắm vững khái niệm về xác suất và đánh giá xác suất rời rạc với 5 chủ đề 
                                            chính trong thống kê: thống kê mô tả, ước tính tham số, kiểm tra giả thuyết, hồi quy 
                                            - tương quan và phân tích phương sai.
                                        </li>
                                        <li>
                                            Sinh viên được học về cách thức và thời điểm để thay đổi thái độ đối tượng truyền
                                            thông, các cách thức giao tiếp gián tiếp, cách đối tượng truyền thông tiếp xúc với 
                                            truyền hình và internet..
                                        </li>

                                    </ul>
                                </td>
                            </tr>
                            <tr>
                                <th scope="row">2</th>
                                <td>
                                    <ul>
                                        <li>Kĩ năng giao tiếp và cộng tác</li>
                                        <li>Nguyên lý Kế toán</li>
                                        <li>Truyền thông doanh nghiệp</li>
                                        <li>Sản xuất nội dung sáng tạo</li>
                                        <li>Công cụ thiết kế trực quan 1</li>
                                        <li>Vovinam 3</li>
                                    </ul>
                                </td>
                                <td>
                                    <ul>
                                        <li>
                                            Sinh viên nắm được vai trò của cá nhân – nhóm - cơ cấu tổ chức. Đặc biệt chú trọng
                                            vào sự khác biệt cá nhân, thái độ, động lực, sự hài lòng công việc, truyền thông,
                                            lãnh đạo, căng thẳng, thay đổi, và văn hoá tổ chức.
                                        </li>
                                        <li>
                                            Sinh viên có kiến thức về kế toán tài chính, kế toán quản lý và tài chính doanh nghiệp 
                                            bao gồm: giao dịch kinh doanh, định dạng và phân tích báo cáo tài chính, hàng tồn kho 
                                            và khoản phải thu, loại tài sản và trách nhiệm 
                                            pháp lý, phân loại chi phí, ngân sách chính và lập dự toán ngân sách.
                                        </li>
                                        <li>
                                            Sinh viên có kiến thức và kỹ năng để thể hiện sáng tạo của bản thân trên nhiều thể loại 
                                            khác nhau. Sinh viên còn có kỹ năng tìm kiếm, thu thập các nguồn tài liệu, tổng hợp các
                                            ý tưởng, kỹ năng viết và biên tập.
                                        </li>
                                        <li>
                                            Sinh viên hiểu nền tảng cơ bản của truyền thông doanh nghiệp. Cung cấp cho các học viên 
                                            cơ hội để thực hành giao tiếp trong truyền thông kinh doanh.
                                        </li>
                                    </ul>
                                </td>
                            </tr>
                            <tr>
                                <th scope="row">3</th>
                                <td>
                                    <ul>
                                        <li>Nhiếp ảnh</li>
                                        <li>Marketing mạng xã hội</li>
                                        <li>Công cụ thiết kế trực quan 2</li>
                                        <li>Sản xuất âm thanh</li>
                                        <li>Truyền thông Marketing tích hợp</li>
                                    </ul>
                                </td>
                                <td>
                                    <ul>
                                        <li>
                                            Sinh viên được học phương thức, bố cục và trải nghiệm chụp ảnh trong studio hiện đại.
                                        </li>
                                        <li>
                                            Sinh viên được học về cách sử dụng các công cụ phân tích các chỉ số liên quan đến khách hàng, dựa vào
                                            đó để xây dựng chiến lược truyền thông mạng xã hội một cách hoàn chỉnh.
                                        </li>
                                        <li>
                                            Sinh viên nắm vững kiến thức nền tảng về hiệu ứng âm thanh, ứng dụng trên nhiều phương tiện khác nhau, 
                                            có kỹ thuật chuyên nghiệp để thu, chỉnh sửa và tạo ra âm thanh chất lượng.
                                        </li>
                                        <li>
                                            Sinh viên có thể sử dụng thành thạo các công cụ thiết kế: Adobe Illustrator, Indesign
                                        </li>
                                        <li>
                                            Sinh viên được trang bị kiến thức và cách thức sử dụng các công cụ truyền thông kỹ thuật số, các công
                                            cụ marketing trên Internet. Giúp sinh viên quản lý và thực hiện các hoạt động marketing bằng cách sử dụng các phương tiện truyền thông điện tử như website, email, iTV, các phương tiện không dây kết hợp với các dữ liệu số về đặc điểm và hành vi của khách hàng.
                                        </li>
                                    </ul>
                                </td>
                            </tr>
                            <tr>
                                <th scope="row">4</th>
                                <td>
                                    <ul>
                                        <li>Nghệ thuật thuyết phục và bán ý tưởng</li>
                                        <li>Viết cho truyền thông đa phương tiện</li>
                                        <li>Sản xuất video</li>
                                        <li>Quản trị dự án</li>
                                        <li>Ngoại ngữ 2 (1): Tiếng Trung Quốc</li>
                                    </ul>
                                </td>
                                <td>
                                    <ul>
                                        <li>
                                            Sinh viên được phát triển kỹ năng trình bày và thể hiện bản thân cũng như lập chiến lược để thương mại hóa ý tưởng sáng tạo.
                                        </li>
                                        <li>
                                           Sinh viên khám phá vai trò của truyền thông đa phương tiện trong thế giới ngày nay và tác động của nó đến cuộc sống hàng 
                                           ngày của chúng ta.
                                        </li>
                                        <li>
                                            Sinh viên hiểu biết sâu sắc về máy ảnh, điều khiển âm thanh, ánh sáng và chỉnh sửa video. Sinh viên sẽ làm việc cá nhân và theo nhóm để viết,
                                            chụp và chỉnh sửa các dự án của riêng mình.
                                        </li>
                                        <li>
                                            Sinh viên được học cách quản lý dự án như lập kế hoạch, thực hiện, giám sát, kiểm soát và kết thúc các dự án.
                                        </li>
                                        <li>
                                            Sinh viên có kiến thức cơ bản về ngữ âm, cách viết và câu đơn giản, và được trang bị kiến thức cơ bản về nghe tiếng Trung Quốc
                                        </li>
                                    </ul>
                                </td>
                            </tr>
                            <tr>
                                <th scope="row">5</th>
                                <td>
                                    <ul>
                                        <li>Nguyên lý thiết kế trải nghiệm người dùng</li>
                                        <li>Lập kế hoạch truyền thông</li>
                                        <li>Thuật kể chuyện đa phương tiện</li>
                                        <li>Quản trị thương hiệu</li>
                                        <li>Ngoại ngữ 2 (1): Tiếng Trung Quốc</li>
                                    </ul>
                                </td>
                                <td>
                                    <ul>
                                        <li>
                                            Sinh viên nắm vững nguyên tắc của thiết kế như lắng nghe người dùng, các phương tiện và khả năng kết nối của người dùng 
                                            với giao diện đã được thiết kế.
                                        </li>
                                        <li>
                                            Sinh viên được thử sức với vai trò của một nhà hoạch định chiến lược truyền thông, tìm hiểu về sự phức tạp trong đàm phán đầu tư truyền thông,
                                            thương thảo hợp đồng giữa bên mua và bên bán các kênh, phương tiện truyền thông.
                                        </li>
                                        <li>
                                            Sinh viên thiết kế chiến lược để lan tỏa ý nghĩa câu chuyện trên nhiều phương tiện khác nhau. Sinh viên nắm vững cách thức thu hút đối tượng
                                            mục tiêu vào một câu chuyện được truyền thông trên các nền tảng, bao gồm trải nghiệm web tương tác, cộng đồng, thiết bị di động, công viên chủ đề và thậm chí cả thực tế ảo tăng cường.
                                        </li>
                                        <li>
                                            Sinh viên sẽ được phát triển kiến thức, kỹ năng để quản lý và phát triển chiến lược thương hiệu trong lĩnh vực tiếp thị, hiểu rõ về vai trò của quản lý thương hiệu trong việc đạt được 
                                            và duy trì lòng trung thành của khách hàng.
                                        </li>
                                        <li>
                                            Sinh viên có kiến thức cơ bản về ngữ âm, cách viết và câu đơn giản, và được trang bị kiến thức cơ bản về nghe tiếng Trung Quốc
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
                                        <li>Kĩ năng viết bài nghiên cứu</li>
                                        <li>Môn chuyên ngành tự chọn 1</li>
                                        <li>Môn chuyên ngành tự chọn 2</li>
                                        <li>Môn chuyên ngành tự chọn 3</li>
                                        <li>Môn chuyên ngành tự chọn 4</li>
                                    </ul>
                                </td>
                                <td>
                                    <ul>
                                        <li>
                                            Sinh viên được học về các kỹ năng viết bài nghiên cứu: xác định các hình
                                            thức điển hình của bài tiểu luận; lựa chọn và nghiên cứu các chủ đề; soạn thảo, sử dụng ngôn ngữ học thuật và trình bày nghiên cứu; trích dẫn tài liệu tham khảo.
                                        </li>
                                    </ul>
                                </td>
                            </tr>
                            <tr>
                                <th scope="row">8</th>
                                <td>
                                    <ul>
                                        <li>Dự án sản xuất sản phẩm TTĐPT</li>
                                        <li>Phương pháp nghiên cứu trong truyền thông</li>
                                        <li>Luật sở hữu trí tuệ</li>
                                        <li>Môn chuyên ngành tự chọn</li>
                                    </ul>
                                </td>
                                <td>
                                    <ul>
                                        <li>
                                            Sinh viên tìm hiểu và nghiên cứu quy trình sáng tạo và kỹ thuật trong các sản phẩm video, âm thanh, radio, phát triển sản phẩm truyền thông trên nền 
                                            tảng web và đa phương tiện. 
                                        </li>
                                        <li>
                                            Sinh viên có kiến thức về các phương pháp nghiên cứu xã hội học, hiểu và biết cách vận dụng các công cụ nghiên cứu và đánh giá truyền thông cụ thể.
                                        </li>
                                        <li>
                                            Bên cạnh kiến thức chuyên môn, sinh viên còn nắm vững Luật bản quyền, kiến thức về quan hệ xã hội và công việc.
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
                                            Sinh viên biết cách quản trị dự án thành công.
                                        </li>
                                        <li>
                                             Sinh viên tự tin làm việc trong lĩnh vực truyền thông tại các doanh nghiệp Việt Nam và nước ngoài.
                                        </li>
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
