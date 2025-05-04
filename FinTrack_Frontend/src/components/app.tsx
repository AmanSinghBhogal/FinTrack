/**
 * @license
 * Copyright (c) 2014, 2025, Oracle and/or its affiliates.
 * Licensed under The Universal Permissive License (UPL), Version 1.0
 * as shown at https://oss.oracle.com/licenses/upl/
 * @ignore
 */
import { registerCustomElement } from "ojs/ojvcomponent";
import { h } from "preact";
import { useEffect } from "preact/hooks";
import Context = require("ojs/ojcontext");
import { Footer } from "./footer";
import { Header } from "./header";
import { Content } from "./content/index";
import { Profiles } from "./profiles/index";
import { Avatars } from "./avatars/index";

type Props = Readonly<{
  appName?: string;
  userLogin?: string;
  data?: data[] | null;
}>;

type data = {
  name: string | null,
  age: number | null
}

const mydata = [
  {
    "name": "Aman",
    "age": 22
  },
  {
    "name": "Mausmi",
    "age": 23
  },
  {
    "name": null,
    "age": 23
  },
  {
    "name": "abc",
    "age": null
  }
]

export const App = registerCustomElement(
  "app-root",
  ({ appName = "FinTrack", userLogin = "mausmi.sinha@oracle.com", data = mydata}: Props) => {
    useEffect(() => {
      Context.getPageContext().getBusyContext().applicationBootstrapComplete();
    }, []);
    
    return (
      <div id="appContainer" class="oj-web-applayout-page">
        <Header 
          appName={appName} 
          userLogin={userLogin} 
        />
        <Avatars/>
        <Profiles 
        />
        {
            data==null? "NO Data found": data.map((item, key) => (
                <Content
                  key={key}
                  name = {item.name}
                  age = {item.age}
                />
            ))
        }
        <Footer />
      </div>
    );
  }
);
