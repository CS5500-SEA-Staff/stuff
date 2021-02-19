package edu.northeastern.cs5500.backend.model;

import dagger.Module;
import dagger.Provides;

@Module
public class ModelModule {
    @Provides
    public Class<Stuff> provideStuffClass() {
        return Stuff.class;
    }

    @Provides
    public Class<User> provideUserClass() {
        return User.class;
    }
}

// @Module for class，@Provides for method
// get the object/class of this class by @Module

/*
workflow:
    class A{
        @inject
        class B;-> a dependency
     }
1. @Inject B（i.e. dependency）

2.在 Module 中创建返回值为相应实体类的方法，并用 @Provides 标注
for class B:
@ Module @Provides to implement the method

3.then, dagger will inject B for A?

***Q:so, mark @injection when some class/ method needs a dependency?
*/

// 调用Component（注入器）的injectXXX（Object）方法开始注入（injectXXX方法名字是官方推荐的名字,以inject开始）
// Component就像媒介,连接 Module和目标类，把目标类依赖的实例注入到目标类中，来初始化目标类中的依赖。
