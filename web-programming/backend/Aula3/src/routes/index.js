"use strict";
class IndexRoute {
    async index(req, res) {
        res.render("index/index");
    }
    async teste(req, res) {
        res.render("index/teste");
    }
    async produtos(req, res) {
        res.render("index/produtos");
    }
}
module.exports = IndexRoute;
//# sourceMappingURL=index.js.map