// java --enable-preview --source 21 TemplateTest.java

public class TemplateTest {

	public void perform() {
		String email = "person@mail.com";
		String page = STR."""
			<html>
				<head>
					<title>Just Servlet Output</title>
					<link rel='stylesheet' href='styles/main.css' type= 'text/css'/>
				</head>
				<body>
					<h1>Thanks for joining our email list</h1>
					<p>Here is the information that you entered:</p>
					<label>Email:</label>
					<span>\{email}</span>
				</body>
			</html>""";
	
		System.out.println(page);
	}
	
	void main() {
		new TemplateTest().perform();
	}
}