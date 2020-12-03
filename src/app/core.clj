(ns app.core
  (:gen-class)
  (:require
    [org.httpkit.server :as httpkit]))

(defn handler [request]
  #_(require 'clojure.pprint)
  #_(clojure.pprint/pprint request)
  (cond
    (and
      (= :get (:request-method request))
      (= "/hello" (:uri request)))
    {:body "Hello World!"
     :status 200}

    (and
      (= :get (:request-method request))
      (= "/goodbye" (:uri request)))
    {:body "Bye!"
     :status 200}

    :else
    {:body "Not found"
     :status 404}))

(defonce server (atom nil))

(defn start! [port]
  (reset! server
          (httpkit/run-server #'handler
                              {:port port}))
  (println "Started server on port" port))

(defn stop! []
  (@server)
  (reset! server nil))

(defn -main [& [port]]
  (start! (Integer. (or port (System/getenv "PORT")))))

