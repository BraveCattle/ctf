.class public Lu/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroid/app/Application;

.field public final synthetic c:Lu/e$a;


# direct methods
.method public constructor <init>(Landroid/app/Application;Lu/e$a;)V
    .locals 0

    iput-object p1, p0, Lu/c;->b:Landroid/app/Application;

    iput-object p2, p0, Lu/c;->c:Lu/e$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lu/c;->b:Landroid/app/Application;

    iget-object v1, p0, Lu/c;->c:Lu/e$a;

    invoke-virtual {v0, v1}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method
