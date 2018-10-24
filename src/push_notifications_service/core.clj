(ns push-notifications-service.core
  (:require [org.httpkit.server :refer [run-server]]))

(defn app [req]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    (str ("body" "main"))})

(defn -main [& args]
  (run-server app {:port 8080})
  (println "Server started on port 8080"))
