import app = require("teem");

class IndexRoute {
	public async index(req: app.Request, res: app.Response) {
		res.render("index/index");
	}

	public async teste(req: app.Request, res: app.Response) {
		res.render("index/teste");
	}

	public async produtos(req: app.Request, res: app.Response) {
		res.render("index/produtos");
	}
}

export = IndexRoute;
