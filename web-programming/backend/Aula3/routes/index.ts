import app = require("teem");

class IndexRoute {
	public async index(req: app.Request, res: app.Response) {
		let options = {
			username: "Guilherme",
			loops: 5,
		}

		res.render("index/index", options);
	}

	public async teste(req: app.Request, res: app.Response) {
		res.render("index/teste");
	}

	public async produtos(req: app.Request, res: app.Response) {
		res.render("index/produtos");
	}
}

export = IndexRoute;
